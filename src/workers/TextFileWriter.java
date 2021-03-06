package workers;

import format.Formatter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;

/**
 *
 * @author zsummers
 */
public class TextFileWriter {
    private Formatter fmt;
    private String filePath;

    public TextFileWriter(Formatter fmt, String filePath) {
        this.fmt = fmt;
        this.filePath = filePath;
    }

    public void setFmt(Formatter fmt) {
        //needs validation
        this.fmt = fmt;
    }

    public void setFilePath(String filePath) {
        //needs validation
        this.filePath = filePath;
    }
    
    public void writeFile(Map<String, Object>[] toWrite) throws FileNotFoundException{
        try (PrintWriter writer = new PrintWriter(filePath)) {
            writer.print(fmt.encode(toWrite));
        }
        
    }
}
