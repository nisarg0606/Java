package Practice.Isha;

import java.util.Scanner;

public class MaxofTwo {
    public static int Max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("The max of two numbers is: "+Max(a, b));
        sc.close();
    }
}