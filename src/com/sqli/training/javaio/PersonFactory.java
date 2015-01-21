package com.sqli.training.javaio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class PersonFactory {

    public static Person createPerson(String personDetails){
        String personFirstName = getPersonFirstName(personDetails);
        String personLastName = getPersonLastName(personDetails);
        Date personBirthDate = getPersonBithDate(personDetails);
        
        return new Person(personFirstName, personLastName, personBirthDate);
    }

    private static Date getPersonBithDate(String personDetails) {
        String dateAsString = personDetails.split(",")[2];
        DateFormat format = new SimpleDateFormat("d-M-yyyy", Locale.ENGLISH);
        Date birthDate = null;
        try {
            birthDate = format.parse(dateAsString);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return birthDate;
    }

    private static String getPersonLastName(String personDetails) {
        return personDetails.split(",")[1];
    }

    private static String getPersonFirstName(String personDetails) {
        return personDetails.split(",")[0];
    }
    
    
}
