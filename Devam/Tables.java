package Devam;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n you want table of: ");
        int n = sc.nextInt();
        int i = 1;
        System.out.println("Using While loop");
        while (i <= 10) {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        }
        System.out.println();
        System.out.println("Using Do...While loop");
        i = 1;
        do {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        } while (i <= 10);
    }
}