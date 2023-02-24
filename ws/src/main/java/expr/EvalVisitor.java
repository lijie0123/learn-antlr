package expr;

import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends ExprBaseVisitor<Integer>{
    Map<String, Integer> mem=new HashMap<String,Integer>();
    @Override
    public Integer visitAssign(ExprParser.AssignContext ctx) {
        String key = ctx.ID().getText();
        int val = visit(ctx.expr());
        mem.put(key,val);
        return val;
    }

    @Override
    public Integer visitAddSub(ExprParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if(ctx.op.getType() == ExprParser.ADD){
            return left+right;
        }else {
            return left - right;
        }
    }

    @Override
    public Integer visitMulDiv(ExprParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if(ctx.op.getType() == ExprParser.ADD){
            return left*right;
        }else {
            return left / right;
        }
    }

    @Override
    public Integer visitBlank(ExprParser.BlankContext ctx) {
        return 0;
    }

    @Override
    public Integer visitId(ExprParser.IdContext ctx) {
        String key = ctx.ID().getText();
        return mem.getOrDefault(key,0);
    }

    @Override
    public Integer visitInt(ExprParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitPrintExpr(ExprParser.PrintExprContext ctx) {
        System.out.println(ctx.expr().getText() + "="+visit(ctx.expr()));
        return 0;
    }

    @Override
    public Integer visitParens(ExprParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitClear(ExprParser.ClearContext ctx) {
        System.out.println(ctx.getChild(0).getText());
        mem.clear();
        return 0;
    }

    @Override
    public Integer visitClearid(ExprParser.ClearidContext ctx) {
        System.out.println(ctx.getText());
        mem.remove(ctx.ID().getText());
        return 0;
    }
}
