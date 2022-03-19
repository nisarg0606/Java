package USA_Practice;
import java.util.Scanner;
public class SortingArray {
    public static void main(String[] args) {
        // what do you understand of sorting....    // arrange something in an order    // Sort Array of Numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements do you want: ");
        int n = sc.nextInt();       int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\nBefore Sorting: ");
        for (int i : arr)
            System.out.print(i + "  ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { // ascending
                    // if (arr[i] < arr[j]) {descending
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nAfter Sorting: ");
        for (int i : arr)
            System.out.print(i + "  ");
    }
}
