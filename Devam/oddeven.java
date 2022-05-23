package Devam;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to check is even or not: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is an even number");
        } else
            System.out.println(n + " is an odd number");
    }
}