package Aarsh;

import java.util.Scanner;

public class EvenOddInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5], odd = 0, even = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0)
                even = even + 1;
            else
                odd = odd + 1;
        }

        System.out.println("Total number of even numbers in the array are: " + even);
        System.out.println("Total number of odd numbers in the array are: " + odd);

    }
}
