import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;



public class XMLWriter implements WriteIO{

    private java.io.FileWriter fileWriter;
    private XMLOutputter xmlOutputter;
    
    
    public XMLWriter(String filePath) {
        try {
            fileWriter = new java.io.FileWriter(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void open() throws IOException {
        xmlOutputter = new XMLOutputter(); 
        
    }

    @Override
    public void write(Object object) throws IOException {
        xmlOutputter.setFormat(Format.getPrettyFormat());
        xmlOutputter.output((Document)object, fileWriter);
    }

    @Override
    public void close() throws IOException {
        fileWriter.close();
    }

}
