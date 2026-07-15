// Numero control: 22031149

grammar Expr;

root : expr EOF;

expr : VAL OP VAL;
VAL: NUM;
OP: MENOS ;

NUM : [0-9]+ ;
MENOS : '-' ;
WS : [ \t\r\n]+ -> skip ;
