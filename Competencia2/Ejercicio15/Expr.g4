// Numero de control: 22031149

grammar Expr;

root: expr EOF ;    

expr : (NMAP|SS|SUDO|TCPDUMP|CURL|DIG|JOURNALCTL|GREP|UFW|DENY|FROM|MX|TODAY|OP|IP|NUM|CADENA|RUTA|ID)* ;

NMAP: 'nmap';
SS: 'ss';
SUDO: 'sudo';
TCPDUMP:'tcpdump';
CURL:'curl';
DIG:'dig';
JOURNALCTL:'journalctl';
GREP:'grep';
UFW: 'ufw';
DENY:'deny';
FROM: 'from';
MX: 'MX';
TODAY: 'today';

OP: '--'[a-zA-Z]+ | '-'[a-zA-Z]+;
IP: [0-9]+ '.' [0-9]+ '.' [0-9]+ '.' [0-9]+ ('/' [0-9]+)?;

NUM : [0-9]+ ;
CADENA : '"' (~["\r\n])* '"' ;
RUTA: '/' [a-zA-Z0-9_./]+;

ID : [a-zA-Z_][a-zA-Z0-9_.]* ;

ASIG : '=' ;
COMA: ',';
MAS : '+' ;
MAYOR_IGUAL:'>=';

PUNTO : '.' ;
PUNTO_COMA : ';' ;
PAR_IZQ : '(' ;
PAR_DER : ')' ;
LLAVE_IZQ : '{' ;
LLAVE_DER : '}' ;
COR_IZQ : '[' ;
COR_DER : ']' ;
ASTERISCO: '*';

WS : [ \t\r\n]+ -> skip ;