package Devam;

import java.util.Scanner;

public class maxofthreenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
            // && is known as logical AND
        if(a > b && a > c)
        {
            System.out.println("A is the biggest number");
        }
        else if(b > a && b > c)
        {
            System.out.println("B is The biggest number");
        }
        //logical OR -> || 
        // 
        else{
            System.out.println("c is the biggest number");
        }
    }
}
