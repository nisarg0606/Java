package USA_Practice;

import java.util.Scanner;

public class largestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("Largest number is " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest number is " + b);
        } else {
            System.out.println("Largest number is " + c);
        }
        sc.close();
    }
}