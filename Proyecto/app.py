import streamlit as st
from archivo import Archivo
from analizador_lexico import AnalizadorLexico

from Helper import Helper


class App:

    def __init__(self):
        st.set_page_config(page_title="Analizador de SQL", layout="wide")
        self.analizador = AnalizadorLexico()
        self.sintactico = Helper()

    # Metodo de apoyo para mostrar una lista de errores de forma clara,
    # tanto en tabla como en texto (linea por linea)
    def mostrar_errores(self, errores):

        st.dataframe(errores, use_container_width=True)

        for err in errores:
            st.write(f"- Linea {err['linea']}, columna {err['columna']}: {err['mensaje']}")

    def ejecutar(self):
        st.title("Analizador de SQL con ANTLR y Streamlit")
        st.write("Sube un archivo `.txt` o '.sql' para ver tokens y errores lexicos.")

        archivo_subido = st.file_uploader("Selecciona tu archivo", type=["txt", "sql"])

        if archivo_subido is None:
            st.info("Primero sube un archivo .txt")
            return

        archivo = Archivo(archivo_subido)

        if not archivo.es_txt():
            st.error("El archivo debe ser .txt")
            return

        codigo = archivo.leer()
        info = archivo.obtener_info()

        st.subheader("Informacion del archivo")
        st.write("Nombre:", info["nombre"])
        st.write("Extension:", info["extension"])

        st.subheader("Codigo original")
        st.code(codigo, language="text")

        # ------------------------------------------------------------
        # ETAPA 1: Analisis lexico
        # ------------------------------------------------------------
        self.analizador.analizar(codigo)

        tokens = self.analizador.obtener_tokens()
        errores_lexicos = self.analizador.obtener_errores()

        st.subheader("Tokens")

        if len(tokens) == 0:
            st.warning("No se encontraron tokens")
        else:
            st.dataframe(tokens, use_container_width=True)

        st.subheader("Errores lexicos")

        if len(errores_lexicos) > 0:

            st.error(f"Se encontraron {len(errores_lexicos)} errores lexicos. Se detiene el analisis.")
            self.mostrar_errores(errores_lexicos)

            # Detenemos aqui: si hay errores lexicos no tiene caso
            # seguir con el analisis sintactico ni el semantico
            return

        st.success("No hay errores lexicos")

        # ------------------------------------------------------------
        # ETAPA 2: Analisis sintactico
        # ------------------------------------------------------------
        st.subheader("Analisis Sintactico")

        resultado = self.sintactico.analizar(codigo)

        if not resultado["correcto"]:

            errores_sintacticos = resultado["errores_sintacticos"]

            st.error(f"Se encontraron {len(errores_sintacticos)} errores sintacticos. Se detiene el analisis.")
            self.mostrar_errores(errores_sintacticos)

            # Detenemos aqui: un arbol mal formado no se puede
            # analizar semanticamente de forma confiable
            return

        st.success("No se encontraron errores sintacticos")

        st.subheader("Arbol Sintactico")

        st.code(
            resultado["arbol"].toStringTree(
                recog=resultado["parser"]
            ),
            language="text"
        )

        # ------------------------------------------------------------
        # ETAPA 3: Analisis semantico
        # ------------------------------------------------------------
        st.subheader("Analisis Semantico")

        errores_semanticos = resultado["errores_semanticos"]

        if len(errores_semanticos) > 0:

            st.error(f"Se encontraron {len(errores_semanticos)} errores semanticos.")
            self.mostrar_errores(errores_semanticos)
            return

        st.success("No se encontraron errores semanticos")
        st.success("El codigo paso las tres etapas de analisis sin errores.")


if __name__ == "__main__":
    app = App()
    app.ejecutar()