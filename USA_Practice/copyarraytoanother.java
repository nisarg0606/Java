package USA_Practice;

import java.util.Scanner;

public class copyarraytoanother {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[a.length];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the " + (i + 1) + " element of the array: ");
            a[i] = sc.nextInt();
        }
        // for (int i = 0; i < a.length; i++) {
        // b[i] = a[i];
        // }
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            b[j] = a[i];
            j++;
        }
        System.out.println("New Array is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);
        }
    }
}