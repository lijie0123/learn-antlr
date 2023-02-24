package expr;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ExprParser parser = new ExprParser(null);
        parser.setBuildParseTree(false);
        int lineno=0;
        System.out.printf("[%d]:", lineno);
        for (String line = input.readLine(); line != null; line = input.readLine()) {
            parser.lineno=lineno;
            ANTLRInputStream cs = new ANTLRInputStream(line + '\n');
            ExprLexer lexer = new ExprLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser.setInputStream(tokens);
            parser.stat();
            lineno++;
            System.out.printf("[%d]:", lineno);
        }
    }
}
