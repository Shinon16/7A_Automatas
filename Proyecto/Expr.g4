grammar Expr;

root: statement* EOF;

SELECT: 'SELECT';
FROM: 'FROM';
WHERE: 'WHERE';

INSERT: 'INSERT';
INTO: 'INTO';
VALUES: 'VALUES';

UPDATE: 'UPDATE';
SET: 'SET';

DELETE: 'DELETE';

CREATE: 'CREATE';
TABLE: 'TABLE';
DATABASE: 'DATABASE';
USE: 'USE';
GO: 'GO';

CONSTRAINT: 'CONSTRAINT';
IDENTITY: 'IDENTITY';

ALTER: 'ALTER';
ADD: 'ADD';
DROP: 'DROP';

TOP: 'TOP';
LIKE: 'LIKE';
IN: 'IN';
BETWEEN: 'BETWEEN';
IS: 'IS';

PRIMARY: 'PRIMARY';
KEY: 'KEY';
FOREIGN: 'FOREIGN';
REFERENCES: 'REFERENCES';

NOT: 'NOT';
NULL: 'NULL';
UNIQUE: 'UNIQUE';
CHECK: 'CHECK';
DEFAULT: 'DEFAULT';

JOIN: 'JOIN';
INNER: 'INNER';
LEFT: 'LEFT';
RIGHT: 'RIGHT';
ON: 'ON';
FOR: 'FOR';
DISTINCT: 'DISTINCT';

GROUP: 'GROUP';
BY: 'BY';

ORDER: 'ORDER';
ASC: 'ASC';
DESC: 'DESC';
AND: 'AND';
OR: 'OR';

COUNT: 'COUNT';
SUM: 'SUM';
AVG: 'AVG';
MIN: 'MIN';
MAX: 'MAX';

BEGIN: 'BEGIN';
TRANSACTION: 'TRANSACTION';
COMMIT: 'COMMIT';
ROLLBACK: 'ROLLBACK';

PROCEDURE: 'PROCEDURE';
TRIGGER: 'TRIGGER';
EXEC: 'EXEC';
AS: 'AS';

INT: 'INT';
BIGINT: 'BIGINT';
SMALLINT: 'SMALLINT';
TINYINT: 'TINYINT';
BIT: 'BIT';
DATE: 'DATE';
DATETIME: 'DATETIME';
DECIMAL: 'DECIMAL';
VARCHAR: 'VARCHAR';
CHAR: 'CHAR';

TRUE: 'TRUE';
FALSE: 'FALSE';

EQ: '=';
NEQ: '<>';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';

LPAREN: '(';
RPAREN: ')';
COMA: ',';
PT_COMA: ';';
STAR: '*';
PUNTO: '.';

IDT: [a-zA-Z_][a-zA-Z0-9_]*;
NUM: [0-9]+('.'[0-9]+)? ;
CAD: '\'' (~['\r\n])* '\'' ;
LINE_COMMENT: '--' ~[\r\n]* -> skip ;
BLOCK_COMMENT: '/*' .*? '*/' -> skip ;
WS: [ \t\r\n]+ -> skip ;



statement: selectStatement PT_COMA? | insertStatement PT_COMA? | updateStatement PT_COMA?| 
            deleteStatement PT_COMA? | createTableStatement PT_COMA? | createProcedureStatement PT_COMA?| 
            createTriggerStatement PT_COMA? | beginTransactionStatement PT_COMA? | commitStatement PT_COMA? | 
            rollbackStatement PT_COMA? ;

selectStatement: SELECT DISTINCT? selectList FROM tableReference joinClause* whereClause? groupByClause? orderByClause?;

selectList: STAR | expression (COMA expression)* ;

tableReference: IDT alias?;

alias: IDT;

insertStatement: INSERT INTO tableReference LPAREN columnList RPAREN VALUES LPAREN valueList RPAREN;

updateStatement: UPDATE tableReference SET assignmentList whereClause?;

assignmentList: assignment (COMA assignment)*;

assignment: IDT EQ value;

deleteStatement: DELETE FROM tableReference whereClause?;

createTableStatement: CREATE TABLE IDT LPAREN tableElement (COMA tableElement)* RPAREN;

tableElement: columnDefinition | tableConstraint;

columnDefinition: IDT dataType identityClause? nullClause? constraint* ;

identityClause: IDENTITY LPAREN NUM COMA NUM RPAREN;

nullClause: NULL | NOT NULL;

dataType: INT | BIGINT | SMALLINT | TINYINT | BIT | DATE | DATETIME | VARCHAR LPAREN NUM RPAREN| 
            CHAR LPAREN NUM RPAREN | DECIMAL LPAREN NUM COMA NUM RPAREN;

constraint: PRIMARY KEY | FOREIGN KEY LPAREN IDT RPAREN REFERENCES IDT LPAREN IDT RPAREN | NOT NULL| 
            UNIQUE | DEFAULT value | CHECK LPAREN condition RPAREN ;

columnConstraint: PRIMARY KEY | UNIQUE | DEFAULT value | CHECK LPAREN condition RPAREN;

tableConstraint: CONSTRAINT IDT PRIMARY KEY LPAREN columnList RPAREN | CONSTRAINT IDT FOREIGN KEY LPAREN columnList RPAREN
                REFERENCES IDT LPAREN columnList RPAREN;

whereClause: WHERE condition;

joinClause: (INNER | LEFT | RIGHT)? JOIN tableReference ON condition;

groupByClause: GROUP BY columnList;

orderByClause: ORDER BY columnList (ASC | DESC)?;

condition: expression comparator expression ((AND | OR) expression comparator expression)*;

comparator: EQ | LT | GT | LE | GE | NEQ;

expression: IDT | IDT PUNTO IDT | value | aggregateFunction;

aggregateFunction: COUNT LPAREN STAR RPAREN | SUM LPAREN IDT RPAREN | AVG LPAREN IDT RPAREN
                     | MIN LPAREN IDT RPAREN | MAX LPAREN IDT RPAREN;

columnList: IDT (COMA IDT)*;

valueList: value (COMA value)*;

value: NUM | CAD | NULL | TRUE | FALSE;

createProcedureStatement: CREATE PROCEDURE IDT AS statement*;

createTriggerStatement: CREATE TRIGGER IDT ON IDT FOR INSERT AS statement*;

beginTransactionStatement: BEGIN TRANSACTION;

commitStatement: COMMIT;

rollbackStatement: ROLLBACK;