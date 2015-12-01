package service;

import format.Formatter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import workers.TextFileReader;
import workers.TextFileWriter;

/**
 *
 * @author zsummers
 */
public class FileService {
    private Formatter fmt;
    private String filePath;
    private TextFileReader reader;
    private TextFileWriter writer;

    public FileService(Formatter fmt, String filePath) {
        this.fmt = fmt;
        this.filePath = filePath;
        reader = new TextFileReader(fmt, filePath);
        writer = new TextFileWriter(fmt, filePath);
    }

    public void setFmt(Formatter fmt) {
        //needs validation
        this.fmt = fmt;
        reader.setFmt(fmt);
        writer.setFmt(fmt);
    }

    public void setFilePath(String filePath) {
        //needs validation
        this.filePath = filePath;
        reader.setFilePath(filePath);
        writer.setFilePath(filePath);
    }
    
    public void writeFile(Map<String, Object>[] toWrite) throws FileNotFoundException{
        writer.writeFile(toWrite);
    }
    
    public Map<String, Object>[] readFile() throws IOException{
        return reader.readFile();
    }
    
}
