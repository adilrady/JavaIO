

import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;


public class ProcessIO {
    ReadIO reader;
    WriteIO writer;
    
    public ProcessIO(ReadIO reader, WriteIO writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void copyFile() throws IOException{
        reader.open();
        writer.open();
        String line;
        while((line = (String)reader.readLine()) != null){
            writer.write(line);
        }
        reader.close();
        writer.close();
    }
    
    public void copyPerson() throws IOException{
        reader.open();
        writer.open();
        MyPerson person;
        while((person = (MyPerson)reader.readLine()) != null){
            writer.write(person);
        }
        reader.close();
        writer.close();
    }
    
    public void readModifyWriteXML() throws IOException{
        reader.open();
        writer.open();
        Document document = (Document) reader.readLine();
        Element rootNode = document.getRootElement();
        Element nom = rootNode.getChild("etudiant").getChild("nom");
        nom.setName("prenom");
        writer.write(document);
        reader.close();
        writer.close();
    }
}
