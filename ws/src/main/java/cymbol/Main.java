package cymbol;

import csv.CsvLexer;
import csv.CsvParser;
import csv.Reader;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) throws Exception{
        CharStream cs= new ANTLRFileStream("./src/main/java/cymbol/t.cym");
        Lexer lex = new CymbolLexer(cs);
        CommonTokenStream ts = new CommonTokenStream(lex);
        CymbolParser p = new CymbolParser(ts);
        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTree root = p.file();
        CommentAlter reader = new CommentAlter(ts);
        walker.walk(reader, root);
        System.out.print(reader.rw.getText());
    }
}
