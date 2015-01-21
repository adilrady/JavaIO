

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class PersonSerialWriter implements WriteIO{

    private FileOutputStream fileStream;
    private ObjectOutputStream output;
    
    public PersonSerialWriter(String filePath) {
        try {
            this.fileStream = new FileOutputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void write(Object object) throws IOException {
        output.writeObject(object);
    }
    
    @Override
    public void open() throws IOException {
        output = new ObjectOutputStream(fileStream);
    }

    @Override
    public void close() throws IOException {
        output.close();
        
    }

    
}
