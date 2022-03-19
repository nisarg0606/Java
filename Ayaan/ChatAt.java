package Ayaan;

import java.util.Scanner;

public class ChatAt {
    public static void main(String[] args) {
        char s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        s = sc.next().charAt(0);
        System.out.println(s);
        sc.close();
    }
}
