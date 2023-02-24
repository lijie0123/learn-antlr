grammar Json;
@header{package json;}

file: json EOF;

json: object
    | array
    ;

value: object
    | array
    | atom
    ;

object: '{' pair (',' pair)* (',')? '}'
      | '{' '}'
      ;
array: '[' value (',' value)* ','? ']'
     | '[' ']'
     ;
atom: STRING # string
    | INT # int
    | 'true' # bool
    | 'false' # bool
    | 'null' # null
    ;

pair : STRING ':' value;


STRING: '"'(ESC|~[\\"])*'"';
fragment ESC: '\\' ('\\/bfnrt'| UNICODE);
fragment UNICODE: 'u' HEX HEX HEX HEX;
fragment HEX: [0-9a-zA-Z];

INT: ('+'|'-')?('0'| [1-9][0-9]*) ;

WS: [ \r\n\t]+ -> skip;
