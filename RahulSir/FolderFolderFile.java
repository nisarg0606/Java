package RahulSir;

import java.io.*;
import java.util.Scanner;
public class FolderFolderFile {
    public static void main(String[] args) throws IOException {
        Scanner myobj1 = new Scanner(System.in);
        System.out.println("Enter the folder name here: ");
        String username1 = myobj1.nextLine();

        File objDir1 = new File("e:\\"+username1);
        if (!objDir1.exists()) {
            objDir1.mkdir();
        }

        Scanner myobj2 = new Scanner(System.in);
        System.out.println("Enter the folder name here: ");
        String username2 = myobj2.nextLine();

        File objDir2 = new File("e:\\"+username2);
        System.out.println(objDir2);
        myobj1.close();        
        myobj2.close();        
    }    
}
