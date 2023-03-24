package assign3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class TestingFile {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        File file = new File(path + "/assign3/fortunes.txt");
        // System.out.println(file.exists());
        // print lines which start with two tabs
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(new FileInputStream(file), "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String line;
        try {
            while ((line = new BufferedReader(reader).readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}