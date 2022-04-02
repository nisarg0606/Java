package Ayaan;

import java.util.Scanner;

public class MaxMin {
    int max(int arr[])
    {
        int max = arr[0];
        for (int i : arr) {
            if(max < i)
            {
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements you want in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }
        MaxMin obj = new MaxMin();
        System.out.println(obj.max(arr));
    }
}
