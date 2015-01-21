package com.sqli.training.javaio;

import java.io.IOException;


public interface ReadIO {

    void open() throws IOException;
    Object readLine() throws IOException;
    void close() throws IOException;
}
