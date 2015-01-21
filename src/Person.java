

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.jdom2.Element;


public class Person implements Serializable{

    private static final long serialVersionUID = 1L;
    private int id; 
    private String firstName;
    private String lastName;
    private Date birthDate;

    public Person(int id, String firstName, String lastName, Date birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
    
    public Element getAsJDOMElement(){
        Element element = new Element("personne");
        element.addContent(new Element("id").setText(id+""));
        element.addContent(new Element("nom").setText(firstName));
        element.addContent(new Element("prenom").setText(lastName));
        element.addContent(new Element("dateNaissance").setText(new SimpleDateFormat("dd/M/yyyy").format(birthDate)));
        return element;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Fist Name  : ").append(firstName+"\n")
               .append("Last Name  : ").append(lastName+"\n")
               .append("Birth Date : ").append(new SimpleDateFormat("dd-MM-yyyy").format(birthDate)+"\n")
               .append("---------------------------------------------");
        
        return builder.toString();
    }
}
