package USA_Practice;

import java.util.Scanner;

// Find the middle char of a string using function
// i) if string length is odd then print 1 characters
//  ii) if even then two character
// In this program basically string's functions will be used like substring .length 
// you need to figure out how substring function works
// make a program to figure out how substring function works
// take a string from the user and print 2nd to 5th substring
// eg: Reyaansh  -> eyaan
class Function {

    public static void main(String[] args) {
        // String name = "Reyaansh";// the output should be aa
        // // name = name.substring(2, 6);// starting index to ending index - 1// the
        // // ending index is exclusive
        // // System.out.println(name);
        // System.out.println(name.length());
        // String name1 = "Kairavy";// the output should be r
        // System.out.println(name1.length());// index starts from 0 and goes till n - 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.println("The Middle character/charaters is/are " + middle(str));
    }

    public static String middle(String str) {
        int position;
        int length;
        if (str.length() % 2 == 0)// 8
        {
            position = str.length() / 2 - 1; /// sir length function returns the len like 8 but
            // actully index starts from 0 in the string...
            length = 2;
        } else {
            position = str.length() / 2;//k a i r a v y
            length = 1;
        }
        return str.substring(position, position+length);
    }
}