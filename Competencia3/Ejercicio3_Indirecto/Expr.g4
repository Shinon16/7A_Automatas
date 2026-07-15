// Numero de control: 22031149

grammar Expr;

root : expr EOF;

expr : VAL ASG VAR;

VAL : ID;
ID: [a-zA-Z][a-zA-Z0-9]*;
ASG: IGUAL;
VAR : NUM;

IGUAL : '=';

NUM : [0-9]+;

WS : [ \t\r\n]+ -> skip;