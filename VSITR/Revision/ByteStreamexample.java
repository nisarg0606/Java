package VSITR.Revision;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
class InputOutputStreamExample {
    public static void main(String[] args) throws IOException {
        byte content[] = "hey there this is nisarg shah".getBytes();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(content);
        inputStream.read(content);
        File newFile = new File("VSITR\\Revision\\bytestream.txt");
        FileOutputStream outputStream = new FileOutputStream(newFile);
        outputStream.write(content);
        outputStream.close();
    }
}