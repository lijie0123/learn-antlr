package json;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws Exception{
        CharStream cs=new ANTLRFileStream("./src/main/java/json/t.json");
        JsonLexer lex= new JsonLexer(cs);
        TokenStream ts = new CommonTokenStream(lex);
        JsonParser parser = new JsonParser(ts);
        ParseTreeWalker walker = new ParseTreeWalker();
        Json2Xml json2Xml = new Json2Xml();
        JsonParser.FileContext file = parser.file();
        file.json();
        walker.walk(json2Xml,file);
        OutputStream fout=new FileOutputStream("./json2xml.xml");
        fout.write(json2Xml.result.getBytes(StandardCharsets.UTF_8));
        fout.close();
    }
}
