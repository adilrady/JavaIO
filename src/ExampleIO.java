

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dto.Person;


public class ExampleIO {

    public static void main(String[] args) throws IOException {
//        ReadIO readIO = new FileReader("C:/Users/user/Desktop/infile.txt");
//        WriteIO writeIO = new FileWriter("C:/Users/user/Desktop/outfile.txt");
//        ProcessIO processIO = new ProcessIO(readIO, writeIO);
//        processIO.copyFile();
        
//        ReadIO personReader = new PersonReader("C:/Users/user/Desktop/infile.txt");
//        WriteIO personWriter = new PersonWriter("C:/Users/user/Desktop/outfile.txt");
        ProcessIO processIO;// = new ProcessIO(personReader, personWriter);
//        processIO.copyPerson();
        
        ReadIO amineReader = new PersonSerialReader("C:/Users/user/Desktop/myfile2");
//        personSrialReader.open();
//        Person person = (Person) personSrialReader.readLine();
//        System.out.println(person.toString());
//        personSrialReader.close();

        WriteIO personSerialWriter = new PersonSerialWriter("C:/Users/user/Desktop/All.txt");
//        personSerialWriter.open();
        personSerialWriter.write(new Person("Ahmed", "Berkani", new Date()));
//        personSerialWriter.write(new Person("Adama", "Bocora", new Date()));
//        personSerialWriter.close();
        
        ReadIO myReader = new PersonSerialReader("C:/Users/user/Desktop/personsSerial");
        List<ReadIO> listReader = new ArrayList<ReadIO>();
        listReader.add(myReader);
        listReader.add(amineReader);
        for (ReadIO readIO : listReader) {
            processIO = new ProcessIO(readIO, personSerialWriter);
        }
        
        
    }
}
