package USA_Practice;

import java.util.Scanner;

public class EvanoddinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements you want in the array: ");
        int a[] = new int[sc.nextInt()];
        int oddcount = 0, evencount = 0;
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }

        System.out.println("The total number of odd numbers are: " + oddcount);
        System.out.println("The total number of even numbers are: " + evencount);
    }
}
// String -> gnirtS
// Soham -> mahoS