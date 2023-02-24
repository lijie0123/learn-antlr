grammar Csv;
@lexer::header{package csv;}
@parser::header{package csv;
import java.util.*;
}

file
locals [int line=0]
: hdr (data += datium[$hdr.t] {$line++;})*
    {
    System.out.println($line+" rows");
    for(DatiumContext d:$data){
    System.out.println("r "+d.getSourceInterval());
    }
    };

hdr returns [List t]: row{$t=$row.r;System.out.println("header:"+$row.text);};

datium [List<String> title] returns [Map<String, String> values, String st]
locals [int c=0, int rr]
@init{
$values=new HashMap();
}
@after{
System.out.printf("data row contains %d: %s\n",$c, $values);
}
    : row
        {
        for(;$c<$row.r.size();$c++){
        $values.put($title.get($c), $row.r.get($c));
        }
        $st=$text;
        }
;

row returns [List<String> r]
@init{
$r=new ArrayList();
}
: field{$r.add($field.text);} (COMMA field{$r.add($field.text);})* NL;

field: TEXT
     | STRING
     |
     ;

NL: '\r'?'\n';
TEXT: ~[,\n\r"]+;
STRING: '"'('""'|~'"')*'"';
COMMA : ',';

