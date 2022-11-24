package Aarsh;

import java.util.Scanner;

public class TypesOfLoops {
    // entry coontrol vs exit control
    /*
     * Welcome to my hotel
     * 1. NI
     * 2. SI
     * 3. xyz
     * choice -->
     * 
     * ---
     * do you want to coptinue:
     * chooice = 1
     * while(choice == 1) // true to go inside --> Entry control loop
     * While, For Loop are entry conrol loops
     * do..while loop is exit loop
     */
    public static void main(String[] args) {
        System.out.println("Program to find min and max numbers: ");
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        char choice;
        do {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if (num > max)
                max = num;
            if (num < min)
                min = num;
            System.out.println("Do you want to continue: ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}
