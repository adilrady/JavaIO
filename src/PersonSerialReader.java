

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import dto.Person;


public class PersonSerialReader implements ReadIO{

    private FileInputStream fileStream;
    private ObjectInputStream input;
    
    public PersonSerialReader(String filePath) {
        try {
            fileStream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public Person readLine() throws IOException {
        Person person = null;
        try {
            person = (Person) input.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return person;
    }

    @Override
    public void open() throws IOException {
        input = new ObjectInputStream(fileStream);
    }

    @Override
    public void close() throws IOException {
        input.close();
    }
}
