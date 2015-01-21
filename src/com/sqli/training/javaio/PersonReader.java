package com.sqli.training.javaio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class PersonReader implements ReadIO{

    private File file;
    private BufferedReader reader;
    private PersonFactory personFactory;

    public PersonReader(String filePath) {
        this.file = new File(filePath);
    }
    

    @Override
    public Person readLine() throws IOException {
        String line = reader.readLine();
        if(line == null)
            return null;
        
        return personFactory.createPerson(line);
    }
    
    @Override
    public void open() throws IOException {
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
    }

    @Override
    public void close() throws IOException {
        reader.close();

    }

}
