// Numero de control: 22031149

grammar Expr;

root : expr EOF;

expr : ID IGUAL NUM;

ID : [a-zA-Z][a-zA-Z0-9]*;

IGUAL : '=';

NUM : [0-9]+;

WS : [ \t\r\n]+ -> skip;