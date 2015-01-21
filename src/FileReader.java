

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader implements ReadIO {

    private File file;
    private BufferedReader reader;

    public FileReader(String filePath) {
        this.file = new File(filePath);
    }

    @Override
    public String readLine() throws IOException {
        String line = null;
        line = reader.readLine();
        return line;
    }

    @Override
    public void open() throws IOException {
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
    }

    @Override
    public void close() throws IOException {
        reader.close();

    }

}
