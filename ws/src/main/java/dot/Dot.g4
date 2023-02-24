grammar Dot;
graph: STRICT? (GRAPH|DIGRAPH) id? '{' stmt_list '}' EOF;
stmt_list: (stmt ';'?)* ;
stmt: node_stmt
    | edge_stmt
    | attr_stmt
    | id '=' id
    | subgraph
    ;
attr_stmt: (GRAPH | NODE|EDGE) attr_list;
attr_list: ('[' a_list? ']')+ ;
a_list: (id '=' id (','|';')? )+ ;
node_stmt: node_id attr_list?;
node_id: id port?;
edge_stmt: (node_id | subgraph) edgeRHS attr_list?;
edgeRHS: (edgeop (node_id|subgraph))+;
edgeop: '->' | '--';
subgraph: (SUBGRAPH id?)? '{' stmt_list '}';
port: ':' id (':' id)?;
id: ID
  | STRING
  | NUMBER
  | HTMLSTRING
  ;

STRICT: [Ss][Tt][Rr][Ii][Cc][Tt];
NODE:[Nn][Oo][Dd];
EDGE: [Ee][Dd][Gg][Ee];
SUBGRAPH: [Ss][Uu][Bb][Gg][Rr][Aa][Pp][Hh];
GRAPH: [Gg][Rr][Aa][Pp][Hh];
DIGRAPH: [Dd][Ii][Gg][Rr][Aa][Pp][Hh];
ID: ALPHABET (ALPHABET|DIGIT)+;
STRING: '"'('\\"'|.)*?'"';
NUMBER: ('.'DIGIT+) | ('-'?DIGIT+('.'DIGIT+)?);
HTMLSTRING: '<' (HTMLSTRING|~[<>])*? '>';
fragment ALPHABET: [a-zA-Z\u0080-\u00FF_];
fragment DIGIT: [0-9];

ONELINE_COMMENT: '#'.*?NL ->skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;
COMMA: ',' -> skip;
WS: [\n\r\t ] ->skip;
fragment NL: '\r'?'\n'|EOF;
