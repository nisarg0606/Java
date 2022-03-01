package Ayaan;

import java.util.Scanner;

public class SwtichCaseMerge {
    public static void main(String[] args) {
        System.out.print("Enter your Department id: ");
        Scanner sc = new Scanner(System.in);
        int Department = sc.nextInt();// + - / * %
        switch(Department){
            case 7:
            case 14:
            case 21:
                System.out.println("HR Department");
                break;
            case 11:
            case 22:
            case 33:
                System.out.println("Management Department");
                break;
            case 15:
            case 30:
            case 45:
                System.out.println("Developer Department");
                break;
            default:
                System.out.println("Invalid id....");
        }
    }
}
