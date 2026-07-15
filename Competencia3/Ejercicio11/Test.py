from antlr4 import *
from ExprLexer import ExprLexer
from ExprParser import ExprParser
import sys

entrada = FileStream(sys.argv[1], encoding="utf-8")

lexer = ExprLexer(entrada)
tokens = CommonTokenStream(lexer)

parser = ExprParser(tokens)
arbol = parser.root()

print("Hola mundo")

if parser.getNumberOfSyntaxErrors() == 0:
    print("El codigo es correcto")
    print("Arbol sintactico")
    print(arbol.toStringTree(recog=parser))
else:
    print("El codigo tiene errores de sintaxis")