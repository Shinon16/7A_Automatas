grammar Expr;

root : expr EOF;

expr : IDT ASG expr | NUM ;

IDT: [a-zA-Z]+;
ASG : '=';
NUM : [0-9]+;
WS : [ \t\r\n]+ -> skip;


