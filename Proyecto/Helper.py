from antlr4 import InputStream, CommonTokenStream
from ExprLexer import ExprLexer
from ExprParser import ExprParser


class Helper:

    def analizar(self, codigo):

        entrada = InputStream(codigo)
        lexer = ExprLexer(entrada)
        tokens = CommonTokenStream(lexer)
        parser = ExprParser(tokens)
        arbol = parser.root()

        return {
            "parser": parser,
            "arbol": arbol,
            "correcto": parser.getNumberOfSyntaxErrors() == 0,
            "errores": parser.getNumberOfSyntaxErrors()
        }