package aarsh;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        // what is swich case?
        // switch case is a statement that allows a variable to be tested for equality against a list of values.
        // syntax:
        // switch (expression) {
        //     case value1:
        //         // code to be executed if expression = value1
        //         break;
        //     case value2:
        //         // code to be executed if expression = value2
        //         break; 
        // hotel menu
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Hotel");
        System.out.println("1. Veg");
        System.out.println("2. Non-Veg");
        System.out.println("3. Chinese");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You ordered Veg");
                break;
            case 2:
                System.out.println("You ordered Non-Veg");
                break;
            case 3:
                System.out.println("You ordered Chinese");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
