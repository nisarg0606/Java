package USA_Practice;

import java.util.Scanner;

public class StringComparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter String 2: ");
        String s2 = sc.nextLine();
        if (s1.equalsIgnoreCase(s2)) {//what is the difference between == and equals()
            // == is used to compare the value of two variables and mainly used for object type variables
            // equals() is used to compare the content of two variables
            System.out.println("Both the Strings are equal");
        } else {
            System.out.println("Both the Strings are not equal");
        }
        if(s1 == s2)
        {
            System.out.println("Both the Strings are equal");
        }
        else
        {
            System.out.println("Both the Strings are not equal");
        }
        String arr[] = new String[2];
        arr[0] = "Reyaansh";
        arr[1] = "Reyaansh";
        if(arr[0].equalsIgnoreCase(arr[1]))
        {
            System.out.println("Both the Strings are equal");
        }
        else
        {
            System.out.println("Both the Strings are not equal");
        }
        
    }
}
