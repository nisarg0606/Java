package OCJP;

import java.util.Scanner;
public class First{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int no1, no2, ans;
        System.out.print("Enter no 1: ");
        no1 = sc.nextInt();
        System.out.print("Enter no 2: ");
        no2 = sc.nextInt();
        sc.close();
        ans = no1 + no2;
	System.out.print("Addition ");
        System.out.println(ans);
        ans = no1 - no2;
        System.out.print("Substraction ");
	System.out.println(ans);
        ans = no1 * no2;
	System.out.print("Multiplication ");
        System.out.println(ans);
        ans = no1 / no2;
        System.out.print("Division ");
	System.out.println(ans);
	//ans = no1 % no2;
	//System.out.println(ans);
    }
}