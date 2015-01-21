package com.sqli.training.javaio;

import java.io.IOException;


public class ExampleIO {

    public static void main(String[] args) throws IOException {
        ReadIO readIO = new FileReader("C:/Users/user/Desktop/infile.txt");
        WriteIO writeIO = new FileWriter("C:/Users/user/Desktop/outfile.txt");
        
        ReadIO personReader = new PersonReader("C:/Users/user/Desktop/infile.txt");
        WriteIO personWriter = new PersonWriter("C:/Users/user/Desktop/outfile.txt");
        
//        ProcessIO processIO = new ProcessIO(readIO, writeIO);
        ProcessIO processIO = new ProcessIO(personReader, personWriter);
        
//        processIO.copyFile();
        processIO.copyPerson();
        
    }
}
