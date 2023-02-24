package jav;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;

public class Test {
    public static void main(String[]  args)throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("src/main/java/expr/EvalVisitor.java"));
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree root = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ExtractInterface(parser), root);
    }
}
