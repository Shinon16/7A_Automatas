grammar Expr;

root : expr EOF;

expr : INT IDT IGUAL NUM ;


INT : 'int' ;

IDT : [a-zA-Z]+ ;

IGUAL : '=' ;
NUM : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;

