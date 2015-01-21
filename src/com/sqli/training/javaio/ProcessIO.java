package com.sqli.training.javaio;

import java.io.IOException;


public class ProcessIO {
    ReadIO reader;
    WriteIO writer;
    
    public ProcessIO(ReadIO reader, WriteIO writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void copyFromInputToOutput() throws IOException{
        reader.open();
        writer.open();
        String line;
        while((line = reader.readLine()) != null){
            writer.write(line);
        }
        reader.close();
        writer.close();
    }
}
