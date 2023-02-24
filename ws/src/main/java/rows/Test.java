package rows;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("src/main/java/rows/rows.txt"));
        Lexer lexer = new RowsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RowsParser parser = new RowsParser(tokens, 3);
        parser.setBuildParseTree(false);
        ParseTree root = parser.file();

    }
}
