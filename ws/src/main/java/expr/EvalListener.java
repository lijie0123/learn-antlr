package expr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;
import java.util.Map;

public class EvalListener extends ExprBaseListener{
    ParseTreeProperty<Integer> props;
    Map<String, Integer> mem;

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterProg(ExprParser.ProgContext ctx) {
        super.enterProg(ctx);
        props = new ParseTreeProperty<>();
        mem = new HashMap<>();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitProg(ExprParser.ProgContext ctx) {
        super.exitProg(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitPrintExpr(ExprParser.PrintExprContext ctx) {
        super.exitPrintExpr(ctx);
        System.out.printf("eval %s: %d\n",ctx.expr().getText(), ctx.expr().rt);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitAssign(ExprParser.AssignContext ctx) {
        super.exitAssign(ctx);
        mem.put(ctx.ID().getText(), props.get(ctx.expr()));
        props.put(ctx, props.get(ctx.expr()));
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitBlank(ExprParser.BlankContext ctx) {
        super.exitBlank(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitClear(ExprParser.ClearContext ctx) {
        super.exitClear(ctx);
        mem.clear();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitClearid(ExprParser.ClearidContext ctx) {
        super.exitClearid(ctx);
        mem.remove(ctx.ID().getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitParens(ExprParser.ParensContext ctx) {
        super.exitParens(ctx);
        ctx.rt = ctx.expr().rt;
        props.put(ctx, ctx.rt);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitMulDiv(ExprParser.MulDivContext ctx) {
        if(ctx.op.getType()==ExprParser.MUL){
            ctx.rt = ctx.expr(0).rt * ctx.expr(1).rt;
        }else {
            ctx.rt = ctx.expr(0).rt / ctx.expr(1).rt;
        }
        props.put(ctx, ctx.rt);
        super.exitMulDiv(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitAddSub(ExprParser.AddSubContext ctx) {
        if(ctx.op.getType()==ExprParser.ADD){
            ctx.rt = props.get(ctx.expr(0)) + props.get(ctx.expr(1));
        }else {
            ctx.rt = props.get(ctx.expr(0)) - props.get(ctx.expr(1));
        }
        props.put(ctx, ctx.rt);
        super.exitAddSub(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitId(ExprParser.IdContext ctx) {
        super.exitId(ctx);
        ctx.rt = mem.getOrDefault(ctx.getText(),0);
        props.put(ctx, ctx.rt);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitInt(ExprParser.IntContext ctx) {
        ctx.rt = Integer.parseInt(ctx.INT().getText());
        props.put(ctx, ctx.rt);
        super.exitInt(ctx);
    }

}
