package Devam;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for substraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 for Modulus");
        int choice = sc.nextInt();
        switch(choice)// why we use switch case?
        // switch case is used to look at different scenarios
        {
            case 1:
                System.out.println("The sum of two variables is: " + (a + b));
                break;
            case 2:
                System.out.println("The difference between two variables is: " + (a - b));
                break;
            case 3:
                System.out.println("The multiplication of two variables is: " + (a * b));
                break;
            case 4:
                System.out.println("The division of two variables is: " + (a / b));
                break;
            case 5:
                System.out.println("The modulus of two variables is: " + (a % b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
