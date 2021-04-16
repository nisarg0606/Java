package RahulSir;

import java.util.Scanner;

public class Finallizeblock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of no1: ");
        int no1 = sc.nextInt();
        System.out.print("Enter the value of no2: ");
        int ans=0;
        int no2 = sc.nextInt();
        try {
            ans = no1 / no2;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("Division on no1/no2 is:" + ans);
        sc.close();
    }
}
