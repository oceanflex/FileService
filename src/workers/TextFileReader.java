package workers;

import format.Formatter;
import format.GarageTotalsFormat;

/**
 *
 * @author zsummers
 */
public class TextFileReader {
    private Formatter fmt;
    private String filePath;

    public TextFileReader(Formatter fmt, String filePath) {
        this.fmt = fmt;
        this.filePath = filePath;
    }

    public void setFmt(Formatter fmt) {
        this.fmt = fmt;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
}
