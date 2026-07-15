// Numero de control: 22031149

grammar Expr;

root : expr EOF;

expr : expr MENOS expr| NUM;

NUM : [0-9]+;

MENOS : '-';

WS : [ \t\r\n]+ -> skip;
