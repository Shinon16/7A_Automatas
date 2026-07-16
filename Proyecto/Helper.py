from antlr4 import InputStream, CommonTokenStream, ParseTreeWalker
from antlr4.error.ErrorListener import ErrorListener

from ExprLexer import ExprLexer
from ExprParser import ExprParser
from analizador_semantico import SemanticoListener


# Clase para guardar errores sintacticos, igual que ErroresLexicos
# en analizador_lexico.py pero para el parser
class ErroresSintacticos(ErrorListener):

    # Constructor
    def __init__(self):

        # Lista donde guardaremos los errores
        self.lista = []

    # Metodo que ANTLR ejecuta cuando encuentra un error sintactico
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):

        self.lista.append({
            "linea": line,
            "columna": column,
            "mensaje": msg
        })


class Helper:

    def analizar(self, codigo):

        entrada = InputStream(codigo)
        lexer = ExprLexer(entrada)
        tokens = CommonTokenStream(lexer)
        parser = ExprParser(tokens)

        # Quitamos el listener de errores por defecto de ANTLR (que solo
        # imprime en consola) y ponemos el nuestro para poder mostrar
        # los errores en la interfaz
        errores_sintacticos = ErroresSintacticos()
        parser.removeErrorListeners()
        parser.addErrorListener(errores_sintacticos)

        arbol = parser.root()

        resultado = {
            "parser": parser,
            "arbol": arbol,
            "correcto": parser.getNumberOfSyntaxErrors() == 0,
            "errores": parser.getNumberOfSyntaxErrors(),
            "errores_sintacticos": errores_sintacticos.lista,
            "errores_semanticos": []
        }

        # El analisis semantico solo se hace si no hubo errores sintacticos,
        # ya que un arbol mal formado puede dar resultados semanticos incorrectos
        if resultado["correcto"]:

            analizador_semantico = SemanticoListener()

            # Con Listener, el recorrido del arbol lo hace un ParseTreeWalker:
            # el walker visita todos los nodos automaticamente y llama a
            # nuestros metodos enterX/exitX en el orden en que los encuentra.
            walker = ParseTreeWalker()
            walker.walk(analizador_semantico, arbol)

            resultado["errores_semanticos"] = analizador_semantico.obtener_errores()

        return resultado