package USA_Practice.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String name = bufferedReader.readLine();
        System.out.println("Your Name is: " + name);
        // file size is already in bytes so you all need to convert that into kb and mb
        // bytes to kb --> (double) bytes/1024
        // bytes to mb --> (double) bytes/(1024 * 1024)
        // if my file is of 1 gb then how many bytes will be there in gb?
        // by default file.length() method size of file in bytes only
        // 1024 * 1024 * 1024 / 1024 -> 1024 * 1024 kb
        // 1024 * 1024 * 1024 / (1024 * 1024) -> 1024 mb
    }
}
