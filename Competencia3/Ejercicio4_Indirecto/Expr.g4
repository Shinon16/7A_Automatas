// Numero de control: 22031149

grammar Expr;

root : expr EOF;

expr : PAL VAL OP VLR;

PAL: IF;
IF: 'if';
VAL: ID;
OP: MAYOR;
VLR: NUM;

ID : [a-zA-Z][a-zA-Z0-9]*;

IGUAL : '=';
MAYOR: '>';

NUM : [0-9]+;

WS : [ \t\r\n]+ -> skip;