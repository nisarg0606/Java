package DivaKhushi;

import java.util.Scanner;

public class ForeachLoop {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are: ");
        int j= 0;
        for(int i: arr)// starts from 0 and goes till arr.length
        {
            System.out.println(j+ " "+i);
            j++;
        }
    }
}
