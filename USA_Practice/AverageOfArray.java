package USA_Practice;

import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements you want to enter: ");
        // float n = sc.nextFloat();
        int cast = sc.nextInt();
        float[] array = new float[cast];
        float sum = 0;
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < cast; i++) {
            array[i] = sc.nextInt();
            sum = sum + array[i];
        }
        System.out.println("The avegare of the array is: " + (sum / cast));
    }
}
