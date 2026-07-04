from archivo import Archivo
from analizador_lexico import AnalizadorLexico

class Main:

    def __init__(self):
        self.analizador = AnalizadorLexico()

    def ejecutar(self):

        print("TIPO DE ENTRADA")
        print("-" * 30)
        print("1. Leer desde archivo")
        print("2. Escribir desde terminal")

        opcion = input("\nSeleccione una opcion: ")

        if opcion == "1":

            ruta = input("Escribe la ruta del archivo: ")
            archivo = Archivo(ruta)

            if not archivo.existe():
                print("El archivo no existe")
                return

            if not archivo.es_el_tipo_correcto():
                print("El archivo debe ser .txt")
                return

            codigo = archivo.leer()

            archivo.imprimir_info()

        elif opcion == "2":

            print("\nEscribe el codigo.")
            print("Cuando termines escribe FIN en una linea nueva.\n")

            lineas = []

            while True:
                linea = input()

                if linea == "FIN":
                    break

                lineas.append(linea)

            codigo = "\n".join(lineas)

            print("\nCODIGO CAPTURADO")
            print("-" * 40)
            print(codigo)

        else:
            print("Opcion no valida")
            return

        self.analizador.analizar(codigo)

        self.analizador.imprimir_tokens()
        self.analizador.imprimir_errores()


if __name__ == "__main__":
    app = Main()
    app.ejecutar()