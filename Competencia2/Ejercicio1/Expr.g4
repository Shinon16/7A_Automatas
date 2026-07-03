// Numero de control: 22031149

grammar Expr;

root : expr EOF;

expr : NUM MAS NUM | NUM;

NUM : [0-9]+;

MAS : '+';

WS : [ \t\r\n]+ -> skip;
