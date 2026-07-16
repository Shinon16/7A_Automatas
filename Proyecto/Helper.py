from antlr4 import InputStream, CommonTokenStream, ParseTreeWalker
from ExprLexer import ExprLexer
from ExprParser import ExprParser
from analizador_semantico import SemanticoListener


class Helper:

    def analizar(self, codigo):

        entrada = InputStream(codigo)
        lexer = ExprLexer(entrada)
        tokens = CommonTokenStream(lexer)
        parser = ExprParser(tokens)
        arbol = parser.root()

        resultado = {
            "parser": parser,
            "arbol": arbol,
            "correcto": parser.getNumberOfSyntaxErrors() == 0,
            "errores": parser.getNumberOfSyntaxErrors(),
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