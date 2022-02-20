package USA_Practice;

import java.util.Arrays;

public class DuplicatiesinArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 5, 6, 6, 7, 5, 6 };
        Arrays.sort(arr);// sort --> ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Element " + arr[j]);
                }//set
            }
        }
    }
}