package Ayaan;

import java.util.Scanner;

public class SwitchCaseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println("+ --- Addition");
        System.out.println("- --- Substraction");
        System.out.println("* --- Multiplication");
        System.out.println("/ --- Division");
        System.out.println("% --- Modulo");
        System.out.print("Enter what you want to perform: ");
        char choice = sc.next().charAt(0);
        switch (choice) {
            case '+':
                System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
                break;
            case '-':
                System.out.println("Substraction of " + a + " and " + b + " is " + (a - b));
                break;

            default:
                break;
        }
    }
}