public class ShortToUnicodeString extends ArrayInitBaseListener{
	@Override 
    public void enterInit(ArrayInitParser.InitContext ctx) {
        System.err.println("enter init");
     }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override 
    public void exitInit(ArrayInitParser.InitContext ctx) {
        System.err.println("leave init");
     }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override 
    public void enterValue(ArrayInitParser.ValueContext ctx) {
		if (ctx.INT()!=null){
			int x= Integer.valueOf(ctx.INT().getText());
			System.out.printf("\\u%04x", x);
		}
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
    public void exitValue(ArrayInitParser.ValueContext ctx) {

	 }
}