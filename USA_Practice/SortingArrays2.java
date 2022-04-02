package USA_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements you want in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " Element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting: ");
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] < arr[j]) { // descending order
        //             // if (arr[j] < arr[i]) { //ascending order
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        Arrays.sort(arr);
        System.out.println("\nAfter Sorting: ");
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }
}