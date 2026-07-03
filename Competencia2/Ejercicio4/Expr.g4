// Numero de control: 22031149

grammar Expr;

root : condicion EOF;

condicion : IF ID MAYOR NUM;

IF : 'if';

ID : [a-zA-Z]+;

NUM : [0-9]+;

MAYOR : '>';

WS : [ \t\r\n]+ -> skip;