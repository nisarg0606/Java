package DivaKhushi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements you want to enter in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting....");
        for (int i : arr)
            System.out.print(i + "    ");
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] > arr[j]) {
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        Arrays.sort(arr);
        System.out.println("\nAfter Sorting in ascending order....");
        for (int i : arr)
            System.out.print(i + "    ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("\nAfter Sorting in Descending order....");
        for (int i : arr)
            System.out.print(i + "    ");
    }
}