// Numero control: 22031149

grammar Expr;

root : expr EOF;

expr : VAL OP VAL;
VAL: NUM;
OP: MAS ;

NUM : [0-9]+ ;
MAS : '+' ;
WS : [ \t\r\n]+ -> skip ;
