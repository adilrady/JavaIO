

import java.io.IOException;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;


public class ExampleXML {

    public static void main(String[] args) throws IOException {
//        Element rootElement = new Element("personnes");
//        Document document = new Document(rootElement);
//        
//        Element etudiant = new Element("etudiant");
//        etudiant.setAttribute(new Attribute("class", "P2"));
//        etudiant.addContent(new Element("nom").setText("toto"));
//        document.getRootElement().addContent(etudiant);
//        
//        XMLWriter xmlWriter = new XMLWriter("C:/Users/user/Desktop/personnes.xml");
//        xmlWriter.open();
//        xmlWriter.write(document);
        
        ReadIO xmlReader = new XMLReader("C:/Users/user/Desktop/personnes.xml");
        WriteIO xmlWriter = new XMLWriter("C:/Users/user/Desktop/personnes_modified.xml");
        
        ProcessIO processIO = new ProcessIO(xmlReader, xmlWriter);
        processIO.readModifyWriteXML();
        
    }
}
