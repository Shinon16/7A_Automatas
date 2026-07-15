grammar Expr;

root : expr EOF;

expr : ESC TXT ;

ESC: PRINT;
TXT: CADENA;
PRINT: 'print';
CADENA: '"'~ [\t\r\n]*'"';
WS : [ \t\r\n]+ -> skip;


