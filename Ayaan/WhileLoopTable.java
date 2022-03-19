package Ayaan;

import java.util.Scanner;

public class WhileLoopTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which table do you want: ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= 10)//43563 --> 36534
        {
            System.out.println(n + " * " + i + " = " + (i * n));
            i++;
        }
    }
}