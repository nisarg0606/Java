package USA_Practice;
import java.util.Scanner;
public class LargestAndSmallestInString {
    static void printLargestAndSmallestWord(String str) {
        String[] arr = str.split(" ");
        int maxLength, minLength;
        maxLength = Integer.MIN_VALUE;
        minLength = Integer.MAX_VALUE;
        String largest = "", Smallest = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < minLength) {
                Smallest = arr[i];
                minLength = arr[i].length();
            }
            if (arr[i].length() > maxLength) {
                largest = arr[i];
                maxLength = arr[i].length();
            }
        }
        System.out.println("The Smallest Word is " + Smallest + " and its length is " + minLength);
        System.out.println("The Largest Word is " + largest + " and its length is " + maxLength);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        printLargestAndSmallestWord(str);
    }
}
