package DivaKhushi;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements you want in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Array you entered is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int arrcopy[] = new int[n];
        for (int i = 0; i < n; i++) {
           arrcopy[i] = arr[i];
        }
        System.out.println("The second array is ");
        for (int i = 0; i < n; i++) {
            System.out.println(arrcopy[i]);
        }
    }
}
