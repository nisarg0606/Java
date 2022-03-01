package Practice;

import java.io.File;
import java.util.Scanner;

public class FilesAmit {
    public static void main(String[] args) {
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Directory Name: ");
        String fileName = sc.next();
        File d = new File("c:\\Temp\\", fileName);
        String name[] = d.list();
        if (d.exists()) {
            System.out.println("Present....");

            for (int i = 1; i < name.length; i++) {
                if (name[i].endsWith("java") || name[i].endsWith("java")) {
                    counter++;
                }
            }
            System.out.println(counter);
            for (int j = 1; j < name.length; j++) {
                if (d.isHidden()) {

                    d.delete();
                    System.out.println("Deleted hiden file");
                }
            }
        } else {
            System.out.println("Dir is not Present..");
        }
    }
}