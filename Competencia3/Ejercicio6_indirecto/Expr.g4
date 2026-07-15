// Numero de control: 22031149

grammar Expr;

root : expr EOF;

expr : VAR OP VAR POR VAR;

POR: MULT;
VAR: NUM;
NUM : [0-9]+;

OP: MAS;
MAS : '+';

MULT : '*';

WS : [ \t\r\n]+ -> skip;