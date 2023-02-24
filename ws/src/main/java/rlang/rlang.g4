grammar rlang;
prog: stmtList EOF;

stmtList: (stmt? (';'|NL))*;

stmt: ID ('<-'|'='|'<<-') expr
    | expr
    ;

expr: expr '[[' subList ']' ']'
    | expr '[' subList ']'
    | expr ('::'|':::') expr
    | expr ('$'|'@') expr
    | <assoc=right> expr '^' expr
    | ('+' | '-') expr
    | expr ':' expr
    | expr USER_OP expr
    | expr ('*'|'/') expr
    | expr ('+'|'-') expr
    | expr ('>'|'<'|'>='|'<=') expr
    | expr ('=='| '!=') expr
    | '!' expr
    | expr ('&'|'&&') expr
    | expr ('|' | '||') expr
    | '~' expr
    | expr '~' expr
    | expr ('->' | '->>'| ':=') expr
    | '{' exprList '}'
    | 'if' '(' expr ')' expr ('else' expr)?
    | 'function' '(' formList? ')' expr
    | expr '(' subList ')'
    | NUMBER
    | ID
    ;

exprList: expr? ((';'|NL) expr)*;

formList: form (',' form)*;
form: ID ('=' expr)?
    | '...'
    ;
subList: sub (',' sub)*;
sub: expr
    | ID '=' (expr)?
    | STRING '=' (expr)?
    | 'NULL' '=' (expr)?
    | '...'
    ;

STRING: '"' ('\\.'|~[\\])*? '"';
NL: '\r'? '\n';
USER_OP: '%' ID '%';
ID: '.' (LETTER |'.'|'_') (LETTER|'.'|'_'|DIGIT)*
    | (LETTER |'_') (LETTER|'.'|'_'|DIGIT)*
    ;
NUMBER: DIGIT+;
fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];

WS: [ \t] ->skip;

