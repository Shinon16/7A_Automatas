// Numero de control: 22031149

grammar Expr;

root : expr EOF;

expr : PRINT PARI CAD PARF PTO_COMA;

PRINT : 'print';

PARI : '(';
PARF : ')';
PTO_COMA : ';';
CAD : '"' (~["\r\n])* '"';
WS : [ \t\r\n]+ -> skip;