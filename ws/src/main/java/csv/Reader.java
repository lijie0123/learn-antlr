package csv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reader extends CsvBaseListener{
    List<Map<String, String>> data;
    List<String> currentRow;
    List<String> header;
    String currentField;
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterFile(CsvParser.FileContext ctx) {
        super.enterFile(ctx);
        data = new ArrayList<>();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitFile(CsvParser.FileContext ctx) {
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
    public void exitHdr(CsvParser.HdrContext ctx) {
        super.exitHdr(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitDatium(CsvParser.DatiumContext ctx) {
        super.exitDatium(ctx);

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterRow(CsvParser.RowContext ctx) {
        super.enterRow(ctx);
        this.currentRow = new ArrayList<>();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitRow(CsvParser.RowContext ctx) {
        super.exitRow(ctx);
        if(ctx.getParent().getRuleIndex()==CsvParser.RULE_hdr){
            header=currentRow;
        }else{
            Map<String, String> row=new HashMap<>();
            int index=0;
            for (String f :
                    currentRow) {
                row.put(header.get(index), f);
                index +=1;
            }
            data.add(row);
        }
    }



    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitField(CsvParser.FieldContext ctx) {
        super.exitField(ctx);
        int alt = ctx.getAltNumber();
        if (alt==0){
            currentRow.add(ctx.getText());
        }else {
            currentRow.add("string:"+ctx.getText());
        }

    }
}
