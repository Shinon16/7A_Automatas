// Numero de control: 22031149

grammar Expr;

root : expr EOF;

expr : PAL PARI ESP PARF CMA;

PAL: PRINT;
PRINT : 'print';
ESP: CAD;
PARI : '(';
PARF : ')';
CMA: PTO_COMA;
PTO_COMA : ';';
CAD : '"' (~["\r\n])* '"';
WS : [ \t\r\n]+ -> skip;