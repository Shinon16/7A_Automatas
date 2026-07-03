grammar Expr;

root : expr EOF;

expr : INT IDT IGUAL NUM ;

// Palabras reservadas
INT : 'int' ;
// Identificadores
IDT : [a-zA-Z]+ ;
// Operadores
IGUAL : '=' ;
// Literales numéricos
NUM : [0-9]+ ;
// Comentarios y espacios en blanco
WS : [ \t\r\n]+ -> skip ;

