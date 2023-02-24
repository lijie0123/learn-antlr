package prop;

import java.util.HashMap;
import java.util.Map;

public class propLoaderListener extends propBaseListener{
    Map<String, String> mem;
    public propLoaderListener(){
        mem=new HashMap<>();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterFile(propParser.FileContext ctx) {
        super.enterFile(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitFile(propParser.FileContext ctx) {
        super.exitFile(ctx);
    }



    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterLine(propParser.LineContext ctx) {
        super.enterLine(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitLine(propParser.LineContext ctx) {
        super.exitLine(ctx);
        ctx.ass().getAltNumber();
        mem.put(ctx.l.getText(), ctx.r.getText());
        System.out.printf("%s: %s\n", ctx.l.getText(), ctx.r.getText());
    }
}
