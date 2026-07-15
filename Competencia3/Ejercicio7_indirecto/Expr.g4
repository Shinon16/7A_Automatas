grammar Expr;

root : expr EOF;

expr : PAL VAL ASIG VAR ;

PAL: INT;
INT : 'int' ;
VAR: NUM;
VAL: IDT;
IDT : [a-zA-Z]+ ;

ASIG: IGUAL;
IGUAL : '=' ;
NUM : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;

