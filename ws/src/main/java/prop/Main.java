package prop;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream cs = new ANTLRFileStream("./src/main/java/prop/t.prop");
        propLexer lexer = new propLexer(cs);
        TokenStream ts = new CommonTokenStream(lexer);
        propParser p=new propParser(ts);
        propLoaderVisitor v = new propLoaderVisitor();
        v.visit(p.file());
        System.out.printf("\n");
    }
}
