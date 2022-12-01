package Aarsh;

import java.util.Scanner;

public class AlternativeSum {
    public static int altSum(int[] values)
    {
        int arr[] = values;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if( i % 2 == 0) // 0 2 4 6 8 10 .... 
                sum = sum + arr[i];
            else
                sum = sum - arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you want to enter: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) 
            arr[i] = sc.nextInt();
        // int sum = altSum(arr); --> to save memory you can use the below method
        System.out.println("The sum from altsum is: " + altSum(arr));
        sc.close();

        // factorial --> 5! --> 5 * 4 * 3 * 2 * 1 = 120
        // count number of digits in a number --> 123 --> 3 , 1345656 --> 7, 9887 --> 4
        // create method which takes radius and output's the circumference of circle
        // create a class which contains different methods for calculating areas of differnt shapes
        // eg> triangle , circle, equilateral triangle, rectangle, square, rhombus, pentagon,
        // hexagon, heptagon, octagon, trapezoid
        // create a class which contains different methods for calculating volume of different shapes   
    }
}
