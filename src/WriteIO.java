

import java.io.IOException;


public interface WriteIO {

    
    void open() throws IOException;
    void write(Object object) throws IOException;
    void close() throws IOException;
}
