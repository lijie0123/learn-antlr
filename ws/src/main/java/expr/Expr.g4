grammar Expr;

import CommonLexerRules;
@parser::header{
package expr;
import java.util.*;
}
@lexer::header{package expr;}
@parser::members{
 Map<String, Integer> mem=new HashMap<String, Integer>();
 int eval(int left, int op, int right){
 switch(op){
 case MUL: return left * right;
 case DIV: return left / right;
 case ADD: return left + right;
 case SUB: return left - right;
 default: return 0;
 }
 }
 int lineno=0;
}

prog    :   stat+;

stat    :   expr NEWLINE  {System.out.printf("[%s]:%d\n", lineno, $expr.rt);}  # printExpr
        |   ID '=' expr NEWLINE {mem.put($ID.text, $expr.rt);}# assign
        |   NEWLINE # blank
        |   'clear' NEWLINE # clear
        |   'clear' ID NEWLINE# clearid
        ;
expr    returns [int rt]
        :   l=expr op=('*'| '/') r=expr  {$rt = eval($l.rt, $op.type, $r.rt);}  # MulDiv
        |   l=expr op=('+'| '-') r=expr  {$rt = eval($l.rt, $op.type, $r.rt);} # AddSub
        |   INT {$rt = $INT.int;} # int
        |   ID {$rt = mem.getOrDefault($ID.getText(),0);} # id
        |   '(' expr ')'   {$rt=$expr.rt;} # parens
        ;

MUL :   '*';
DIV :   '/';
ADD :   '+';
SUB :   '-';