package com.sqli.training.javaio;

import java.io.IOException;


public interface WriteIO {

    
    void open() throws IOException;
    void write(String textToWrite) throws IOException;
    void close() throws IOException;
}
