# importa ANTLR4 para funciones, aquí activamos el enviroment 
from antlr4 import *
# importarlo para obtener sus metodos 
from ExprLexer import ExprLexer

import sys


if len(sys.argv) > 1:
    input_stream = FileStream(sys.argv[1])
    print(">> Leyendo desde archivo:", sys.argv[1])
else:
    texto = input("? ")
    input_stream = InputStream(texto)
    print(">> Leyendo los datos ingresados desde terminal:")

lexer = ExprLexer(input_stream)
tokens = CommonTokenStream(lexer)
tokens.fill()

print(tokens)


print(f"{'LEXEMA':<15} {'TOKEN':<15} {'TIPO':<6} {'LINEA':<6} {'COLUMNA':<8}")
print("-" * 60)

for token in tokens.tokens:

    if token.type == Token.EOF:
        continue

    nombre_token = lexer.symbolicNames[token.type]
    

    print(f"{token.text:<15} {nombre_token:<15} {token.type:<6} {token.line:<6} {token.column:<8}")

