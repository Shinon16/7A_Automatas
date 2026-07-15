grammar Expr;

root : expr EOF;

expr : IF PAR_IZ IDT MAY NUM PAR_DER ;
IF: 'if';
PAR_IZ: '(';
PAR_DER: ')';
IDT: [a-zA-Z]+;
MAY: '>';
NUM: [0-9]+;
WS: [ \t\r\n]+ -> skip;