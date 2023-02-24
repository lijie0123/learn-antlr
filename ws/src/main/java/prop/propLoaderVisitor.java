package prop;

import java.util.HashMap;
import java.util.Map;

public class propLoaderVisitor extends propBaseVisitor<Void>{
    Map<String,String> mem = new HashMap<>();
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Void visitFile(propParser.FileContext ctx) {
        return super.visitFile(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Void visitLine(propParser.LineContext ctx) {
        System.out.printf("%s: %s\n", ctx.l.getText(), ctx.r.getText());
        mem.put(ctx.l.getText(), ctx.r.getText());
        return super.visitLine(ctx);
    }
}
