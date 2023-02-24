package csv;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream cs= new ANTLRFileStream("./src/main/java/csv/t.csv");
        Lexer lex = new CsvLexer(cs);
        CommonTokenStream ts = new CommonTokenStream(lex);
        CsvParser p = new CsvParser(ts);
        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTree root = p.file();
        Reader reader = new Reader();
        walker.walk(reader, root);
        System.out.print("\n");
    }
}
