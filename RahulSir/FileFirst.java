package RahulSir;

import java.io.File;
import java.io.IOException;

public class FileFirst {
    public static void main(String[] args) throws IOException{
        File objDir = new File("C:\\File_Practice");
        File objFile1 = new File("C:\\File_practice\\Second\\Second.txt");
        File objFile = new File("C:\\File_Practice\\First.txt");
        File objDir2 = new File("C:\\File_practice\\Second");
        if (!objFile.exists()) {
            objFile.createNewFile();
        }else{
            System.out.println("The file1 already Exists");
        }
        if (!objFile1.exists()) {
            objFile1.createNewFile();
        }else{
            System.out.println("The file2 already Exists");
        }
        if (!objDir.exists()) {
            objDir.mkdir();
        } else {
            System.out.println("The folder1 already exists");
        }
        if (!objDir2.exists()) {
            objDir2.mkdir();
        } else {
            System.out.println("The folder2 already exists");
        }
    }
}