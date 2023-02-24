package cymbol;

import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.misc.OrderedHashSet;

import java.util.Set;

public class CallGraph extends CymbolBaseListener{
    static class Graph{
        Set<String> nodes = new OrderedHashSet<>();
        MultiMap<String,String> edges = new MultiMap<>();
        public void edge(String s, String t){
            edges.map(s,t);
        }
        public void node(String s){
            nodes.add(s);
        }
        public String toDOT(){
            StringBuilder builder=new StringBuilder();
            builder.append("digraph G {\n");
            for (String node:nodes){
                builder.append(node);
                builder.append(";");
            }
            builder.append("\n");
            for(String src:edges.keySet()){
                for(String tgt:edges.get(src)){
                    builder.append(src).append(" -> ").append(tgt).append(";\n");
                }
            }
            builder.append("}\n");
            return builder.toString();
        }
    }

    Graph g;
    CallGraph(){
        g=new Graph();
    }
    String currentFunc;
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        super.enterFunctionDecl(ctx);
        String funcName = ctx.ID().getText();
        g.node(funcName);
        currentFunc=funcName;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitFuncCall(CymbolParser.FuncCallContext ctx) {
        super.exitFuncCall(ctx);
        g.edge(currentFunc, ctx.ID().getText());
    }
}
