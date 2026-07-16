#Analizador Semantico
# Clase que representa la tabla de simbolos del analizador semantico.
# Aqui guardamos que tablas existen y que columnas tiene cada una,
# junto con su tipo de dato y si acepta valores NULL.
class TablaSimbolos:

    # Constructor
    def __init__(self):

        # Diccionario: nombre de tabla en minusculas -> informacion de la tabla
        self.tablas = {}

    # Metodo para saber si una tabla ya fue declarada
    def existe_tabla(self, nombre_tabla):

        return nombre_tabla.lower() in self.tablas

    # Metodo para registrar una tabla nueva
    def agregar_tabla(self, nombre_tabla):

        self.tablas[nombre_tabla.lower()] = {
            "nombre_original": nombre_tabla,
            "columnas": {}
        }

    # Metodo para registrar una columna dentro de una tabla ya existente
    def agregar_columna(self, nombre_tabla, nombre_columna, tipo, nullable):

        self.tablas[nombre_tabla.lower()]["columnas"][nombre_columna.lower()] = {
            "nombre": nombre_columna,
            "tipo": tipo,
            "nullable": nullable
        }

    # Metodo para saber si una columna existe dentro de una tabla
    def existe_columna(self, nombre_tabla, nombre_columna):

        tabla = self.tablas.get(nombre_tabla.lower())

        if tabla is None:
            return False

        return nombre_columna.lower() in tabla["columnas"]

    # Metodo para obtener la informacion de una columna (tipo, nullable, etc.)
    def obtener_columna(self, nombre_tabla, nombre_columna):

        tabla = self.tablas.get(nombre_tabla.lower())

        if tabla is None:
            return None

        return tabla["columnas"].get(nombre_columna.lower())