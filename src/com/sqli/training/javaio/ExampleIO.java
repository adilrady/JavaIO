package com.sqli.training.javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class ExampleIO {

    public static void main(String[] args) throws IOException {
        File inputFile = new File("C:/Users/user/Desktop/infile.txt");
        File outputFile = new File("C:/Users/user/Desktop/outfile.txt");
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;
        
        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), "UTF-8"));
        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8")); 
        
        String line;
        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        
        bufferedReader.close();
        bufferedWriter.close();
    }
}
