package Devam;

import java.util.Scanner;

public class Evennumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last value: ");
        int n = sc.nextInt();
        int i = 0;
        while(i <= n)
        {
            // if(i % 2 == 0) // modulu?? --> it returns the remainder.
            if(i % 2 != 0) // modulu?? --> it returns the remainder.
            {// 4 % 2 == 0, 6  % 2 == 0, 112 % 2 == 0 
                System.out.println(i) ;
            }
            i++;
        }
    }
}