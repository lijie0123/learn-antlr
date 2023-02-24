package cymbol;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;

import java.util.List;

public class CommentAlter extends CymbolBaseListener{
    CommonTokenStream ts;
    TokenStreamRewriter rw;
    CommentAlter(CommonTokenStream ts){
        this.ts=ts;
        this.rw=new TokenStreamRewriter(ts);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitVarDecl(CymbolParser.VarDeclContext ctx) {
        super.exitVarDecl(ctx);
        Token semi = ctx.getStop();
        int idx = semi.getTokenIndex();
        List<Token> tokenList=ts.getHiddenTokensToRight(idx, 2);
        if (tokenList!=null){
            Token cmt = tokenList.get(0);
            if (cmt!=null){
                String text = cmt.getText().substring(2,cmt.getText().length()-1);
                String ncmt = "/*" + text +"*/\n";
                rw.insertBefore(ctx.start,ncmt);
                rw.replace(cmt, "\n");
            }
        }
    }
}
