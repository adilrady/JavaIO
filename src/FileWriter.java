

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileWriter implements WriteIO {

    private File file;
    private BufferedWriter writer;
    
    public FileWriter(String filePath) {
        this.file = new File(filePath);
    }

    @Override
    public void write(Object line) throws IOException {
        writer.write((String) line);
        writer.newLine();
    }

    @Override
    public void open() throws IOException {
        writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
        
    }

    @Override
    public void close() throws IOException {
        writer.close();
        
    }

}
