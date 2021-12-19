package DivaKhushi;

import java.util.Scanner;

public class ArraysinJava {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n");
            int n = sc.nextInt();
            //int a[5];
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter the value of arr[" + i + "]");
                arr[i] = sc.nextInt();
            }
            System.out.println("The array is");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}