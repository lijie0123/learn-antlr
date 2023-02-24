grammar Kwd;
@parser::header{package kwd;}
@lexer::header{package kwd;
import java.util.*;}
tokens{BEGIN, END,IF, THEN, WHILE}

@lexer::members{
Map<String, Integer> keywords=new HashMap(){{
put("if", KwdParser.IF);
put("while", KwdParser.WHILE);
put("then", KwdParser.THEN);
put("begin", KwdParser.BEGIN);
put("end", KwdParser.END);
}};
}
file: stat+ EOF;
stat:
     BEGIN stat END
    |IF expr THEN stat
    |WHILE expr stat
    |id '=' expr
    ;
expr: INT
    | id
    | CHAR
    ;
id : IF|ID;
ID: [a-zA-Z]([a-zA-Z0-9_])*{if(keywords.containsKey(getText())){setType(keywords.get(getText()));}};
INT: [0-9]+;
CHAR: '\'' . '\''{setText(String.valueOf(getText().charAt(1)));};
WS: [ \n\t]->skip;