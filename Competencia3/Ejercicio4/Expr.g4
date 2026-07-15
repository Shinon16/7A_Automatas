// Numero de control: 22031149

grammar Expr;

root : expr EOF;

expr : IF ID MAYOR NUM;

IF: 'if';

ID : [a-zA-Z][a-zA-Z0-9]*;

IGUAL : '=';
MAYOR: '>';

NUM : [0-9]+;

WS : [ \t\r\n]+ -> skip;