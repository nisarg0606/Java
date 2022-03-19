package DivaKhushi;

import java.util.Scanner;

public class AverageofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you want in the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the element of the array[" + i + "] : ");
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        float AverageofArray = (float) sum / a.length;
        System.out.println("The Average of the array is: " + AverageofArray);
    }
}
