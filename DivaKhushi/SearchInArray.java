package DivaKhushi;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // System.out.println("Enter the value of n");
            // int n = sc.nextInt();
            // // int arr[] = new int[n];
            // // for (int i = 0; i < arr.length; i++) {
            // //     System.out.println("Enter the value of arr[" + i + "]");
            // //     arr[i] = sc.nextInt();
            // // }
            // // System.out.println("The array is");
            // // for (int i = 0; i < arr.length; i++) {
            // //     System.out.print(arr[i] + " ");
            // // }
            // // System.out.println("\nEnter what you want to search in the array: ");
            // // int search = sc.nextInt();
            // // int flag = -1;
            // // for (int i = 0; i < arr.length; i++) {
            // //     if (arr[i] == search) {
            // //         System.out.println("The element found at index " + i);
            // //         flag = 1;
            // //         break;
            // //     }
            // //     // else{
            // //     // System.out.println("The element not found...");
            // //     // }
            // // }
            // // if (flag == -1) {
            // //     System.out.println("The element not found...");
            // // }
            // char arrchar[] = new char[n];
            // for (int i = 0; i < arrchar.length; i++) {
            //     System.out.println("Enter the value of arr[" + i + "]");
            //     arrchar[i] = sc.next().charAt(0);
            // }
            // System.out.println("The array is");
            // for (int i = 0; i < arrchar.length; i++) {
            //     System.out.print(arrchar[i] + " ");
            // }
            // System.out.println("\nEnter what you want to search in the array: ");
            // char search = sc.next().charAt(0);
            // int flag = -1;
            // for (int i = 0; i < arrchar.length; i++) {
            //     if (arrchar[i] == search) {
            //         System.out.println("The element found at index " + i);
            //         flag = 1;
            //         break;
            //     }
            //     // else{
            //     // System.out.println("The element not found...");
            //     // }
            // }
            // if (flag == -1) {
            //     System.out.println("The element not found...");
            // }

            String name;
            System.out.println("Enter a name: ");
            name = sc.next();
            char search = '1';
            System.out.println("Enter what you want: ");
            search = sc.next().charAt(0);
            if(search == name.charAt(0))
            {
                System.out.println("Found");
            }
        }
        /*
            Primitive data types                non- primitive data types
            int char string float               that are defined by users
            double ....
                                                Students/ Employees
        */
    }
}
/**
 * Enter the value of n
 * 5
 * Enter the value of arr[0]
 * 1
 * Enter the value of arr[1]
 * 2
 * Enter the value of arr[2]
 * 3
 * Enter the value of arr[3]
 * 4
 * Enter the value of arr[4]
 * 5
 * The array is
 * 1 2 3 4 5
 * Enter what number you want to search
 * 3
 * The number is present at index 2
 */


 