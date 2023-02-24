grammar Cppstat;
@header{package cppstat;}
@parser::members{boolean isType(){return java.lang.Character.isUpperCase(getCurrentToken().getText().charAt(0));}
}
@lexer::members{
public static final int COMMENTS = 2;
}
file: stat+ EOF;
stat : decl ';'
    | expr ';'
    ;
decl: ID ID
    | {isType()}?ID '(' ID ')'
    ;
expr: INT
    | ID
    | {!isType()}?ID '(' expr ')'
    ;
ID: [a-zA-Z][a-zA-Z0-9]*;
INT: [0-9]+;
WS : [ \t\n]+ ->channel(2);
