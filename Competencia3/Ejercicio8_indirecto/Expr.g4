// Numero de control: 22031149

grammar Expr;

root : expr EOF;

expr : VAL OP VAR;

VAL: ID;
ID : [a-zA-Z]+;

VAR: NUM;
NUM : [0-9]+;

OP: MAYOR_IGUAL;
MAYOR_IGUAL : '>=';

WS : [ \t\r\n]+ -> skip;