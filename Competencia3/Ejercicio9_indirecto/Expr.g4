grammar Expr;

root : expr EOF;

expr : PAL PAR_IZ VAL OP VAR PAR_DER ;
PAL: IF;
IF: 'if';
PAR_IZ: '(';
PAR_DER: ')';
VAL: IDT;
IDT: [a-zA-Z]+;
OP: MAY;
MAY: '>';
VAR: NUM;
NUM: [0-9]+;
WS: [ \t\r\n]+ -> skip;