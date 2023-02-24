grammar Enum;
@header{package enm;}
@lexer::members{
public boolean java5=true;
}
tokens{ENUM}
prog :(stat|enumDecl|';')+ EOF;
stat: id '=' expr ';';
expr: id
    | INT
    ;
enumDecl: ENUM name=id '{' id (',' id)* '}';
id:  ID
    ;
ID: [a-zA-Z][a-zA-Z0-9_]* {if(getText().equals("enum") && java5)setType(EnumParser.ENUM);};
INT: [0-9]+;
WS: [ \r\n\t]+ ->skip;