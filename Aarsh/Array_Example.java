package Aarsh;

import java.util.Scanner;

public class Array_Example {
    public static void main(String[] args) {
        // properties of array:
        // it stores only similar type of objects aka same data type
        // int --> all data should be of integer type || string --> aLL data of string
        // array is index based. the fist element is always on index 0
        // arrays are not dynamic aka static --> means once you allocate the size then
        // it's fixed

        // types of arrays:
        // 1> single-dimentional --> a[0] --> using for loop
        // 2> two-dimential -> a[0][0] --> using nested for loop
        // 2> multi-dimentional --> a[0][0]......[0] --> nested... nested... nested

        // advantages:
        // 1> Code optimization --> no need to declare more than one variable
        // 2> Random access --> means you can access any element from any index

        // disadvantages:
        // 1> size limit .. -->

        /*
         * int --> 4
         * float -> 4
         * double --> 8
         * long --> 8
         */

        // syntax:
        int array[] = new int[5]; // --> declaration and instation
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        // array[5] = 60; // will I able to access this? Is this correct? --> answer: No
        // reason --> indexing starts from 0. So, 0 to 4 are already 5 elements
        System.out.println(array);
        System.out.println("-----------------");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        // System.out.println(array[5]);

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element for index " + i + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("-----------------");
        System.out.println("The elements you entered are: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
