import java.io.File;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;



public class XMLReader implements ReadIO{

    private SAXBuilder builder = new SAXBuilder();
    private File xmlFile;
    
    
    public XMLReader(String filePath) {
        xmlFile = new File(filePath);
    }
    
    @Override
    public void open() throws IOException {
    }

    @Override
    public Object readLine() throws IOException {
        Document document = null;
        try {
            document = (Document) builder.build(xmlFile);
        } catch (JDOMException e) {
            e.printStackTrace();
        }
        return document;
    }

    @Override
    public void close() throws IOException {
    }

}
