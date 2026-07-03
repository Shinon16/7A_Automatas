grammar Expr;

root : expr EOF;

expr : Print CADENA ;

Print: 'print';
CADENA: '"'~ [\t\r\n]*'"';
WS : [ \t\r\n]+ -> skip;


