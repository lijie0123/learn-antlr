package jav;

public class ExtractInterface extends JavaParserBaseListener{
    JavaParser parser;
    public ExtractInterface(JavaParser parser){this.parser=parser;}

    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        System.out.printf("public interface I%s {\n", ctx.IDENTIFIER().getText());
    }

    @Override
    public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        System.out.println("\n}");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        System.out.printf("%s %s %s;\n",
                ctx.typeTypeOrVoid().getText(),
                ctx.IDENTIFIER().getText(),
                parser.getTokenStream().getText(ctx.formalParameters())
        );
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        super.exitMethodDeclaration(ctx);
    }
}
