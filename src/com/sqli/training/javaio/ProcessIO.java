package com.sqli.training.javaio;

import java.io.IOException;


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
        Person person;
        while((person = (Person)reader.readLine()) != null){
            writer.write(person);
        }
        reader.close();
        writer.close();
    }
}
