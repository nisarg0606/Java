package DivaKhushi;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements you want in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Array you entered is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        int arrrev[] = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--)// Array - 0 1 2 3 4 5
        // arr[o] = arrcopy[0];
        // arr[1] = arrcopy[1];
        {
            arrrev[j] = arr[i];
            j++;
        }
        System.out.println("The value of j is: " + j);
        System.out.println("After reversing the array is : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arrrev[i]);
        }
    }
}
// arr1: 1 2 3 4 5
// arr2: 1 2 3 4 5