grammar prop;

@header{package prop;}


file: first=line (NL+ line)* NL* EOF;
line: l=ID op=ass r=ID ;
ass: EQ # eq
    |SC # sc
    ;

EQ: '=';
SC: ':';
NL : '\r'?'\n';
ID:  [a-zA-Z0-9]+;
WS: [ \t] ->skip;