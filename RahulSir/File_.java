package RahulSir;

// import java.util.Scanner;
import java.io.*;

public class File_ {
    public static void main(String[] args) throws IOException{
        File objFile = new File("E:\\File.txt");
        File objFolder = new File("E:\\File.txt");
        if(!objFile.exists()){
            objFile.createNewFile();
        }else{
            System.out.println("File Already Exits");
        }
        if(!objFolder.exists()){
            objFolder.mkdir();
        }else{
            System.out.println("Folder Already Exits");
        }
    }
}