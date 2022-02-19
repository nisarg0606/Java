package USA_Practice;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // int a[] = new int[5];
        int a[] = { 1, 2, 3, 4, 5 };// declared, initialized
        for (int i = 0; i < a.length; i++)// length??
        {
            System.out.println(a[i]);
        }
        // for each loop talks....// that always works in incremental order.....
        // starts from 0 and goes till the length of the array - 1 index
        System.out.println("Using for each loop");
        for (int i : a)// here in the backgroud 1 value is taken from the array and stored in i of int
                       // type
        { // i = a[0]; --> i = a[1]; --> i = a[2]; --> i = a[length-1]
            System.out.println(i);
        }
        // int arr[] = new int[5];
        // System.out.print("Enter the 5 elements of the array: ");
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // Arrays obj = new Arrays();
        min(new int[] { 1, 2, 3, 4, 5 }); // passing the anonymous array to the method

        System.out.println("Returning the anonymous array from the method");
        int getarray[] = get();

        for (int i : getarray) {
            System.out.println(i);
        }
    }

    // int arr[] = a[];
    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The minimum in the array is : " + min);
    }

    static int[] get() {
        return new int[] { 1, 2, 3, 4, 5, 6 };
    }
}