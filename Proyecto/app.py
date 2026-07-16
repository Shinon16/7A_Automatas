import streamlit as st
from archivo import Archivo
from analizador_lexico import AnalizadorLexico

from Helper import Helper


class App:

    def __init__(self):
        st.set_page_config(page_title="Analizador Léxico", layout="wide")
        self.analizador = AnalizadorLexico()
        self.sintactico = Helper()

    def ejecutar(self):
        st.title("Analizador Léxico con ANTLR y Streamlit")
        st.write("Sube un archivo '.sql' o '.txt' para ver tokens y errores léxicos.")

        archivo_subido = st.file_uploader("Selecciona tu archivo", type=["sql", "txt"])

        if archivo_subido is None:
            st.info("Primero sube un archivo .sql o .txt para analizarlo.")
            return

        archivo = Archivo(archivo_subido)

        if not archivo.es_txt():
            st.error("El archivo debe ser .sql o .txt")
            return

        codigo = archivo.leer()
        info = archivo.obtener_info()

        st.subheader("Información del archivo")
        st.write("Nombre:", info["nombre"])
        st.write("Extension:", info["extension"])

        st.subheader("Código original")
        st.code(codigo, language="text")

        self.analizador.analizar(codigo)

        tokens = self.analizador.obtener_tokens()
        errores = self.analizador.obtener_errores()

        st.subheader("Tokens")

        if len(tokens) == 0:
            st.warning("No se encontraron tokens")
        else:
            st.dataframe(tokens, use_container_width=True)

        st.subheader("Errores léxicos")

        if len(errores) == 0:
            st.success("No hay errores léxicos")
        else:
            st.dataframe(errores, use_container_width=True)
            
        st.subheader("Analisis Sintactico")

        resultado = self.sintactico.analizar(codigo)

        if resultado["correcto"]:

            st.success("No se encontraron errores sintácticos")

            st.subheader("Arbol Sintáctico")

            st.code(
                resultado["arbol"].toStringTree(
                    recog=resultado["parser"]
                ),
                language="text"
            )
            st.subheader("Analisis Semantico")
 
            errores_semanticos = resultado["errores_semanticos"]
 
            if len(errores_semanticos) == 0:
                st.success("No se encontraron errores semanticos")
            else:
                st.error(f"Se encontraron {len(errores_semanticos)} errores semanticos.")
                st.dataframe(errores_semanticos, use_container_width=True)
 
        else:

            st.error(
                f"Se encontraron {resultado['errores']} errores sintácticos."
            )


if __name__ == "__main__":
    app = App()
    app.ejecutar()