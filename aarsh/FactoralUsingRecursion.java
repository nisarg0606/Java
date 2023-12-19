package aarsh;

import java.util.Scanner;

public class FactoralUsingRecursion {
    public int factorialRecurion(int n)
    {
        // recursion 
        if(n == 0)
            return 1;
        else
            return n * factorialRecurion(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new FactoralUsingRecursion().factorialRecurion(n));
    }
}
