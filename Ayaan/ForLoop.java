package Ayaan;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        /*
            *
            * *
            * * *
            * * * * 
            * * * * *
            make this using nested for loop
        
        */
        System.out.println("The factorial of the number is: " + fact);
    }
}