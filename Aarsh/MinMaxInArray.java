package Aarsh;

import java.util.Scanner;

public class MinMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " numbers: ");   
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
                if(arr[i] > max)
                    max = arr[i];
                if(arr[i] < min)
                    min = arr[i];
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    // palindrome number
    // 121 --> is palindrome
    // 123 --> is not palindrome
    
}
