package Ayaan;

import java.util.Scanner;

public class SortingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[] { "Mumbai Indians", "Chennai Super Kings", "Dehli Capitals", "Punjab Kings",
                "Kolkata Knight Riders", "Sunrisers Hyderabad", "Royal Challenges Banglore", "Gujarat Titans",
                "Rajasthan Royals" };
        System.out.println("\nBefore Sorting: \n");
        for (String string : arr) {
            System.out.println(string + "     ");
        }
        System.out.println("\n\nAfter Sorting: \n\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (String string : arr) {
            System.out.println(string + "     ");
        }
    }
}
