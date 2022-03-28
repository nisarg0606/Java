package Ayaan;

import java.util.Scanner;

public class ArrayOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " element: ");
            arr[i] = sc.next();
        }
        for (String i : arr) {
            System.out.print(i + "  ");
        }
        sc.close();
    }
}
