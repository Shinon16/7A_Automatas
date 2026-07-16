# Importamos el Listener generado por ANTLR
from ExprListener import ExprListener

# Importamos la tabla de simbolos (compartida con la version Visitor)
from tabla_simbolos import TablaSimbolos


# Clase principal del analisis semantico, version Listener.

class SemanticoListener(ExprListener):

    # Tipos de dato que consideramos numericos
    TIPOS_NUMERICOS = {"INT", "BIGINT", "SMALLINT", "TINYINT", "DECIMAL"}

    # Tipos de dato que consideramos texto
    TIPOS_TEXTO = {"VARCHAR", "CHAR"}

    # Tipos de dato que consideramos fecha
    TIPOS_FECHA = {"DATE", "DATETIME"}

    # Constructor
    def __init__(self):

        # Tabla de simbolos vacia al iniciar
        self.simbolos = TablaSimbolos()

        # Lista donde se guardan los errores semanticos encontrados
        self.errores = []

    # Metodo para registrar un error semantico
    def error(self, ctx, mensaje):

        self.errores.append({
            "linea": ctx.start.line,
            "columna": ctx.start.column,
            "mensaje": mensaje
        })

    # Metodo para obtener la lista de errores semanticos
    def obtener_errores(self):

        return self.errores

    # ------------------------------------------------------------------
    # CREATE TABLE
    # ------------------------------------------------------------------
    def exitCreateTableStatement(self, ctx):

        nombre_tabla = ctx.IDT().getText()

        # Verificamos que la tabla no haya sido declarada antes
        if self.simbolos.existe_tabla(nombre_tabla):
            self.error(ctx, f"La tabla '{nombre_tabla}' ya fue declarada anteriormente")
            return

        # Registramos la tabla nueva
        self.simbolos.agregar_tabla(nombre_tabla)

        # Primera pasada: registramos todas las columnas de la tabla
        for elemento in ctx.tableElement():

            definicion = elemento.columnDefinition()

            if definicion is None:
                continue

            nombre_columna = definicion.IDT().getText()
            tipo = definicion.dataType().getText()

            # Verificamos que la columna no este repetida
            if self.simbolos.existe_columna(nombre_tabla, nombre_columna):
                self.error(definicion, f"La columna '{nombre_columna}' ya fue declarada en la tabla '{nombre_tabla}'")
                continue

            # Por defecto una columna acepta NULL
            nullable = True

            if definicion.nullClause() is not None:
                nullable = definicion.nullClause().NOT() is None

            # Si la columna es PRIMARY KEY, implicitamente no acepta NULL
            for restriccion in definicion.constraint():
                if restriccion.PRIMARY() is not None:
                    nullable = False

            self.simbolos.agregar_columna(nombre_tabla, nombre_columna, tipo, nullable)

        # Segunda pasada: validamos restricciones (FOREIGN KEY, DEFAULT, CHECK, etc.)
        # Se hace en una segunda pasada para que todas las columnas de la tabla
        # ya esten registradas cuando se validen las restricciones.
        for elemento in ctx.tableElement():

            definicion = elemento.columnDefinition()

            if definicion is not None:
                nombre_columna = definicion.IDT().getText()
                info_columna = self.simbolos.obtener_columna(nombre_tabla, nombre_columna)

                for restriccion in definicion.constraint():
                    self._validar_constraint(restriccion, nombre_tabla, info_columna)

            else:
                restriccion_tabla = elemento.tableConstraint()

                if restriccion_tabla is not None:
                    self._validar_table_constraint(restriccion_tabla, nombre_tabla)

    # Valida una restriccion (constraint) de una columna: FOREIGN KEY, DEFAULT, CHECK
    def _validar_constraint(self, ctx, tabla_actual, info_columna):

        # FOREIGN KEY (col) REFERENCES tabla (columna)
        if ctx.FOREIGN() is not None:

            columna_local = ctx.IDT(0).getText()
            tabla_ref = ctx.IDT(1).getText()
            columna_ref = ctx.IDT(2).getText()

            if not self.simbolos.existe_columna(tabla_actual, columna_local):
                self.error(ctx, f"La columna '{columna_local}' de la FOREIGN KEY no existe en la tabla '{tabla_actual}'")

            if not self.simbolos.existe_tabla(tabla_ref):
                self.error(ctx, f"La tabla '{tabla_ref}' referenciada en FOREIGN KEY no ha sido declarada")
            elif not self.simbolos.existe_columna(tabla_ref, columna_ref):
                self.error(ctx, f"La columna '{columna_ref}' no existe en la tabla '{tabla_ref}' (referenciada en FOREIGN KEY)")

        # DEFAULT value
        elif ctx.DEFAULT() is not None and info_columna is not None:

            valor = ctx.value()

            if not self._tipo_compatible(info_columna["tipo"], valor):
                self.error(ctx, f"El valor por DEFAULT no es compatible con el tipo de la columna '{info_columna['nombre']}' ({info_columna['tipo']})")

        # CHECK (condition)
        elif ctx.CHECK() is not None:

            tablas_disponibles = {tabla_actual.lower(): tabla_actual}
            self._validar_condicion(ctx.condition(), tablas_disponibles)

    # Valida una restriccion a nivel de tabla: CONSTRAINT ... PRIMARY KEY / FOREIGN KEY
    def _validar_table_constraint(self, ctx, tabla_actual):

        listas_columnas = ctx.columnList()

        # CONSTRAINT nombre PRIMARY KEY (columnas)
        if ctx.PRIMARY() is not None:

            for idt in listas_columnas[0].IDT():

                nombre_columna = idt.getText()

                if not self.simbolos.existe_columna(tabla_actual, nombre_columna):
                    self.error(ctx, f"La columna '{nombre_columna}' de la PRIMARY KEY no existe en la tabla '{tabla_actual}'")

        # CONSTRAINT nombre FOREIGN KEY (columnas) REFERENCES tabla (columnas)
        elif ctx.FOREIGN() is not None:

            columnas_locales = listas_columnas[0].IDT()
            tabla_ref = ctx.IDT(1).getText()

            for idt in columnas_locales:

                nombre_columna = idt.getText()

                if not self.simbolos.existe_columna(tabla_actual, nombre_columna):
                    self.error(ctx, f"La columna '{nombre_columna}' de la FOREIGN KEY no existe en la tabla '{tabla_actual}'")

            if not self.simbolos.existe_tabla(tabla_ref):
                self.error(ctx, f"La tabla '{tabla_ref}' referenciada en FOREIGN KEY no ha sido declarada")
            else:

                columnas_ref = listas_columnas[1].IDT() if len(listas_columnas) > 1 else []

                for idt in columnas_ref:

                    nombre_columna = idt.getText()

                    if not self.simbolos.existe_columna(tabla_ref, nombre_columna):
                        self.error(ctx, f"La columna '{nombre_columna}' no existe en la tabla '{tabla_ref}' (referenciada en FOREIGN KEY)")

    # ------------------------------------------------------------------
    # INSERT
    # ------------------------------------------------------------------
    def exitInsertStatement(self, ctx):

        nombre_tabla = ctx.tableReference().IDT().getText()

        if not self.simbolos.existe_tabla(nombre_tabla):
            self.error(ctx, f"La tabla '{nombre_tabla}' no ha sido declarada")
            return

        columnas = ctx.columnList().IDT()
        valores = ctx.valueList().value()

        # Verificamos que la cantidad de columnas coincida con la cantidad de valores
        if len(columnas) != len(valores):
            self.error(ctx, f"En el INSERT de '{nombre_tabla}' se especificaron {len(columnas)} columnas pero se dieron {len(valores)} valores")

        nombres_vistos = set()

        for indice, idt in enumerate(columnas):

            nombre_columna = idt.getText()

            # Verificamos que la columna exista en la tabla
            if not self.simbolos.existe_columna(nombre_tabla, nombre_columna):
                self.error(ctx, f"La columna '{nombre_columna}' no existe en la tabla '{nombre_tabla}'")
                continue

            # Verificamos que la columna no este repetida en el INSERT
            if nombre_columna.lower() in nombres_vistos:
                self.error(ctx, f"La columna '{nombre_columna}' esta repetida en el INSERT")

            nombres_vistos.add(nombre_columna.lower())

            # Si hay un valor correspondiente a esta columna, validamos tipo y nulabilidad
            if indice < len(valores):
                info_columna = self.simbolos.obtener_columna(nombre_tabla, nombre_columna)
                self._validar_valor_columna(ctx, info_columna, valores[indice], nombre_columna)

    # ------------------------------------------------------------------
    # UPDATE
    # ------------------------------------------------------------------
    def exitUpdateStatement(self, ctx):

        nombre_tabla = ctx.tableReference().IDT().getText()

        if not self.simbolos.existe_tabla(nombre_tabla):
            self.error(ctx, f"La tabla '{nombre_tabla}' no ha sido declarada")
            return

        for asignacion in ctx.assignmentList().assignment():

            nombre_columna = asignacion.IDT().getText()

            if not self.simbolos.existe_columna(nombre_tabla, nombre_columna):
                self.error(asignacion, f"La columna '{nombre_columna}' no existe en la tabla '{nombre_tabla}'")
                continue

            info_columna = self.simbolos.obtener_columna(nombre_tabla, nombre_columna)
            self._validar_valor_columna(asignacion, info_columna, asignacion.value(), nombre_columna)

        if ctx.whereClause() is not None:
            tablas_disponibles = {nombre_tabla.lower(): nombre_tabla}
            self._validar_condicion(ctx.whereClause().condition(), tablas_disponibles)

    # ------------------------------------------------------------------
    # DELETE
    # ------------------------------------------------------------------
    def exitDeleteStatement(self, ctx):

        nombre_tabla = ctx.tableReference().IDT().getText()

        if not self.simbolos.existe_tabla(nombre_tabla):
            self.error(ctx, f"La tabla '{nombre_tabla}' no ha sido declarada")
            return

        if ctx.whereClause() is not None:
            tablas_disponibles = {nombre_tabla.lower(): nombre_tabla}
            self._validar_condicion(ctx.whereClause().condition(), tablas_disponibles)

    # ------------------------------------------------------------------
    # SELECT
    # ------------------------------------------------------------------
    def exitSelectStatement(self, ctx):

        tabla_principal = ctx.tableReference()
        nombre_tabla_principal = tabla_principal.IDT().getText()

        if not self.simbolos.existe_tabla(nombre_tabla_principal):
            self.error(ctx, f"La tabla '{nombre_tabla_principal}' no ha sido declarada")
            return

        # Diccionario de tablas disponibles en esta consulta: alias/nombre -> tabla real.
        # Si la tabla principal tiene alias (FROM tabla alias), se registra con ese alias;
        # de cualquier forma tambien queda accesible por su nombre real.
        tablas_disponibles = {nombre_tabla_principal.lower(): nombre_tabla_principal}

        if tabla_principal.alias() is not None:
            alias_principal = tabla_principal.alias().IDT().getText()
            tablas_disponibles[alias_principal.lower()] = nombre_tabla_principal

        # Registramos cada JOIN y validamos su condicion ON
        for join in ctx.joinClause():

            tabla_join = join.tableReference()
            nombre_join = tabla_join.IDT().getText()

            if not self.simbolos.existe_tabla(nombre_join):
                self.error(join, f"La tabla '{nombre_join}' del JOIN no ha sido declarada")
                continue

            alias = tabla_join.alias().IDT().getText() if tabla_join.alias() is not None else nombre_join
            tablas_disponibles[alias.lower()] = nombre_join

            self._validar_condicion(join.condition(), tablas_disponibles)

        # Validamos las columnas del SELECT (si no es SELECT *)
        if ctx.selectList().STAR() is None:
            for expresion in ctx.selectList().expression():
                self._validar_expresion(expresion, tablas_disponibles)

        # Validamos la clausula WHERE
        if ctx.whereClause() is not None:
            self._validar_condicion(ctx.whereClause().condition(), tablas_disponibles)

        # Validamos GROUP BY
        if ctx.groupByClause() is not None:
            for idt in ctx.groupByClause().columnList().IDT():
                self._validar_columna_en_tablas(ctx.groupByClause(), idt.getText(), tablas_disponibles)

        # Validamos ORDER BY
        if ctx.orderByClause() is not None:
            for idt in ctx.orderByClause().columnList().IDT():
                self._validar_columna_en_tablas(ctx.orderByClause(), idt.getText(), tablas_disponibles)

    # ------------------------------------------------------------------
    # Metodos de apoyo (helpers) -- identicos a los de la version Visitor
    # ------------------------------------------------------------------

    # Valida una condicion (WHERE, ON, CHECK), revisando las columnas usadas
    # en cada expresion que la compone
    def _validar_condicion(self, ctx, tablas_disponibles):

        if ctx is None:
            return

        for expresion in ctx.expression():
            self._validar_expresion(expresion, tablas_disponibles)

    # Valida una expresion: puede ser IDT, IDT.IDT, un valor literal o una funcion de agregacion
    def _validar_expresion(self, ctx, tablas_disponibles):

        identificadores = ctx.IDT()

        # Caso: columna simple -> IDT
        if len(identificadores) == 1 and ctx.PUNTO() is None:
            self._validar_columna_en_tablas(ctx, identificadores[0].getText(), tablas_disponibles)

        # Caso: tabla.columna -> IDT PUNTO IDT
        elif len(identificadores) == 2 and ctx.PUNTO() is not None:

            alias = identificadores[0].getText()
            nombre_columna = identificadores[1].getText()

            tabla_real = tablas_disponibles.get(alias.lower())

            if tabla_real is None:
                self.error(ctx, f"'{alias}' no es una tabla o alias definido en esta consulta")
            elif not self.simbolos.existe_columna(tabla_real, nombre_columna):
                self.error(ctx, f"La columna '{nombre_columna}' no existe en la tabla '{tabla_real}'")

        # Caso: funcion de agregacion -> COUNT(*), SUM(columna), etc.
        elif ctx.aggregateFunction() is not None:

            funcion = ctx.aggregateFunction()

            if funcion.IDT() is not None:
                self._validar_columna_en_tablas(funcion, funcion.IDT().getText(), tablas_disponibles)

        # Caso: value (NUM, CAD, NULL, TRUE, FALSE) no requiere validacion semantica

    # Verifica que una columna exista en al menos una de las tablas disponibles
    def _validar_columna_en_tablas(self, ctx, nombre_columna, tablas_disponibles):

        for tabla_real in tablas_disponibles.values():
            if self.simbolos.existe_columna(tabla_real, nombre_columna):
                return True

        tablas_texto = ", ".join(tablas_disponibles.values())
        self.error(ctx, f"La columna '{nombre_columna}' no existe en ninguna de las tablas disponibles ({tablas_texto})")
        return False

    # Obtiene el tipo base de un tipo de dato, sin el tamano entre parentesis
    # Ejemplo: "VARCHAR(50)" -> "VARCHAR", "DECIMAL(10,2)" -> "DECIMAL"
    def _tipo_base(self, tipo_texto):

        return tipo_texto.split("(")[0].strip().upper()

    # Verifica si un valor literal es compatible con el tipo de dato de una columna
    def _tipo_compatible(self, tipo_columna, ctx_valor):

        # NULL siempre es compatible en cuanto a tipo (la nulabilidad se valida aparte)
        if ctx_valor.NULL() is not None:
            return True

        base = self._tipo_base(tipo_columna)

        if ctx_valor.NUM() is not None:
            return base in self.TIPOS_NUMERICOS or base == "BIT"

        if ctx_valor.CAD() is not None:
            return base in self.TIPOS_TEXTO or base in self.TIPOS_FECHA

        if ctx_valor.TRUE() is not None or ctx_valor.FALSE() is not None:
            return base == "BIT"

        return True

    # Valida que un valor asignado a una columna sea correcto: revisa NOT NULL y tipo de dato
    def _validar_valor_columna(self, ctx, info_columna, ctx_valor, nombre_columna):

        if info_columna is None:
            return

        if ctx_valor.NULL() is not None and not info_columna["nullable"]:
            self.error(ctx, f"No se puede asignar NULL a la columna '{nombre_columna}' porque no lo permite (NOT NULL)")
            return

        if not self._tipo_compatible(info_columna["tipo"], ctx_valor):
            self.error(ctx, f"Tipo de dato incompatible para la columna '{nombre_columna}': se esperaba tipo {info_columna['tipo']}")