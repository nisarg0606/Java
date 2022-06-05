package USA_Practice;
import java.util.Scanner;
public class ArrayAndSpecificNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the specific number: ");
        int SpecificNumber = sc.nextInt();
        System.out.print("Enter how many numbers you want to enter in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i+1) + " number: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == SpecificNumber) {
                    System.out.println( arr[i] + " + " + arr[j]+ " = " + SpecificNumber);
                    flag = 1;
                }
            }
        }
        if(flag == 0)
                System.out.println("No such sum exists");
    }
}