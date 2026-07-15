// Numero de control: 22031149

grammar Expr;

root : expr EOF;

expr : ID MAYOR_IGUAL NUM;

ID : [a-zA-Z]+;

NUM : [0-9]+;

MAYOR_IGUAL : '>=';

WS : [ \t\r\n]+ -> skip;