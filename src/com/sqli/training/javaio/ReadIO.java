package com.sqli.training.javaio;

import java.io.IOException;


public interface ReadIO {

    void open() throws IOException;
    String readLine() throws IOException;
    void close() throws IOException;
}
