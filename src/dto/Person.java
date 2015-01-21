package dto;


import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String nom;
    private String prenom;
    private Date date;

    public Person(String nom, String prenom, Date dateNaissance) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.date = dateNaissance;
    }

    @Override
    public String toString() {
        return "nom:" + nom + "\nprenom:" + prenom + "\ndateNaissance:" + date;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        if (prenom == null) {
            if (other.prenom != null)
                return false;
        } else if (!prenom.equals(other.prenom))
            return false;
        return true;
    }

}