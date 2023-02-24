grammar Cymbol;
@header{package cymbol;}

file: (functionDecl|varDecl)+ EOF;
varDecl: type ID ('=' expr)? ';';
type: 'int'
    | 'float'
    | 'void'
    ;

functionDecl: type ID '(' param_list? ')' block;
param_list: param (',' param)*;
param: type ID;

block: '{' stmt* '}';
stmt: block
    | varDecl
    | 'if' expr 'then' stmt ('else' stmt)?
    | 'return' expr ';'
    | expr '=' expr ';'
    | expr ';'
    | ';'
    ;
expr: ID '(' exprList? ')' # funcCall
    | expr '[' expr ']' # exp
    | '-' expr # exp
    | '!' expr #exp
    | expr op=('*'|'/') expr #exp
    | expr op=('+'|'-') expr #exp
    | expr op=('>'|'<') expr #exp
    | expr '==' expr #exp
    | ID # exp
    | number #exp
    | STRING #exp
    | '(' expr ')' #exp
    ;
number: INT
      | FLOAT
      ;

exprList: expr (',' expr)*;

ID: ALPHABET (ALPHABET|DIGIT)*;
fragment ALPHABET: [a-zA-Z\u0080-\u00FF_];
fragment DIGIT: [0-9];
STRING: '"' ('\\.'|.)*? '"';
INT : '-'?DIGIT+;
FLOAT:  ('.'DIGIT+) | ('-'?DIGIT+'.'DIGIT+);
ONELINE_COMMENT: '//'.*?NL ->channel(2);
MULTILINE_COMMENT: '/*' .*? '*/' -> channel(HIDDEN);
WS: [\n\r\t ] ->channel(HIDDEN);
fragment NL: '\r'?'\n'|EOF;