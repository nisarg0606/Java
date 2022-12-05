package aarsh;
import java.util.Scanner;
public class SumOfAllElementsInArray{
    SumOfAllElementsInArray()
    {

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumOfAllElementsInArray sumOfAllElementsInArray = new SumOfAllElementsInArray(); 
        System.out.print("Enter how many elements you want to enter: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        // take input from user to array
        for(int y = 0; y < n; y++)
            array[y] = sc.nextInt();
        System.out.println("Sum: " + sumOfAllElementsInArray.SumOfAllElements(array));
        sc.close();
    }


    public int SumOfAllElements(int arr[])
    {
        int sum = 0;
        for(int i: arr)
            sum = sum + i;
        return sum;
    }

    
}