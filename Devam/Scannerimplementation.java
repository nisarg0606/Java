package Devam;
import java.util.Scanner;
public class Scannerimplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        int c = a + b;// right part is executed first and then it is stored in the left part..
        //In this scenario a + b result is stored in the varible c
        System.out.println("The addition of a and b is: " + c);
    }
}
