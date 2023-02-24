import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class Test{
    public static void main(String[] args)throws Exception{
        String content= """
                { 26, {2,3}, 4 }
                """;
        ANTLRInputStream input = new ANTLRInputStream(new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8)));
        ArrayInitLexer lexer = new ArrayInitLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArrayInitParser parser = new ArrayInitParser(tokens);
        ParseTree tree = parser.init();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ShortToUnicodeString(), tree);
    }
}

