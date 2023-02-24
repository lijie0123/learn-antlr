package json;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class Json2Xml extends JsonBaseListener{
    public Json2Xml(){
        prop = new ParseTreeProperty<>();
    }
    int ident=0;
    ParseTreeProperty<String> prop;
    String result;

    void setProp(ParseTree c, String s){prop.put(c, s);}
    String getProp(ParseTree c){return prop.removeFrom(c);}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitFile(JsonParser.FileContext ctx) {
        result = getProp(ctx.json());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterObject(JsonParser.ObjectContext ctx) {
        super.enterObject(ctx);
        ident +=1;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterArray(JsonParser.ArrayContext ctx) {
        super.enterArray(ctx);
        ident+=1;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitJson(JsonParser.JsonContext ctx) {
        super.exitJson(ctx);
        setProp(ctx, getProp(ctx.getChild(0)));
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitValue(JsonParser.ValueContext ctx) {
        super.exitValue(ctx);
        setProp(ctx, getProp(ctx.getChild(0)));
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitArray(JsonParser.ArrayContext ctx) {
        super.exitArray(ctx);
        StringBuilder builder= new StringBuilder();
        builder.append("\t".repeat(ident-1));
        if (ctx.value().size()==0){
            builder.append("<array/>\n");
        }else {
            builder.append("<array>\n");
            for (ParseTree child :
                    ctx.children) {
                if (child instanceof JsonParser.ValueContext){
                    String val = getProp(child);
                    builder.append(val);
                }
            }
            builder.append("\t".repeat(ident-1));
            builder.append("</array>\n");
        }
        ident -=1;
        setProp(ctx, builder.toString());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterPair(JsonParser.PairContext ctx) {
        super.enterPair(ctx);
        ident +=2;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitPair(JsonParser.PairContext ctx) {
        super.exitPair(ctx);
        StringBuilder builder= new StringBuilder();
        builder.append("\t".repeat(ident-1));
        builder.append(String.format("<key>%s</key>\n", stripQuote(ctx.STRING().getText())));
        builder.append("\t".repeat(ident-1));
        builder.append("<val>\n");
        builder.append(getProp(ctx.value()));
        builder.append("\t".repeat(ident-1));
        builder.append("</val>\n");
        ident -=2;
        setProp(ctx,builder.toString());
    }

    String stripQuote(String in){
        return in.substring(1,in.length()-1);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitObject(JsonParser.ObjectContext ctx) {
        super.exitObject(ctx);
        StringBuilder builder = new StringBuilder();
        builder.append("\t".repeat(Math.max(0, ident - 1)));
        if(ctx.pair().size()==0){
            builder.append("<object/>\n");
        }else {
            builder.append("<object>\n");
            for (JsonParser.PairContext child :
                    ctx.pair()) {
                builder.append("\t".repeat(ident));
                builder.append("<elem>\n");
                builder.append(getProp(child));
                builder.append("\t".repeat(ident));
                builder.append("</elem>\n");
            }
            builder.append("\t".repeat(ident - 1));
            builder.append("</object>\n");
        }
        ident -=1;
        setProp(ctx, builder.toString());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitString(JsonParser.StringContext ctx) {
        super.exitString(ctx);
        setProp(ctx, "\t".repeat(ident)+String.format("<string>%s</string>\n", ctx.STRING().getText()));
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitInt(JsonParser.IntContext ctx) {
        super.exitInt(ctx);
        setProp(ctx, "\t".repeat(ident)+String.format("<int>%s</int>\n", ctx.INT().getText()));
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitBool(JsonParser.BoolContext ctx) {
        super.exitBool(ctx);
        setProp(ctx,"\t".repeat(ident)+String.format("<%s/>\n", ctx.getText()));
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitNull(JsonParser.NullContext ctx) {
        super.exitNull(ctx);
        setProp(ctx, "\t".repeat(ident)+"<null/>\n");
    }
}
