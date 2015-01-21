package com.sqli.training.javaio;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Person implements Serializable{

    private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private Date birthDate;

    public Person(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
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
