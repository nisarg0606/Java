package aarsh;
public class Basics {
    // Data Types
    // int --> 4 bytes --> stores numbers eg. 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    // long --> 8 bytes --> stores numbers eg. 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    // float --> 4 bytes --> stores decimal numbers eg. 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10
    // double --> 8 bytes --> stores decimal numbers eg. 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10
    // char --> 2 bytes --> stores characters eg. a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z
    // boolean --> 1 bit --> stores true or false
    // String --> stores a string of characters eg. "Hello World"


    // Variables
    // int a = 10;
    // long b = 10l;
    // float c = 10.10f; // you need to write f at the end of the number to indicate that it is float
    // double d = 10.10;
    // char e = 'a';
    // boolean f = true;
    // String g = "Hello World";


    // Operators
    // Arithmetic Operators --> +, -, *, /, %  
            // division --> 8 / 5 = 1
            // Modulus Operator --> % --> gives the remainder of a division Eg> 8 % 5 = 3
    // Assignment Operators --> =, +=, -=, *=, /=, %=
            // = equal to
            // += addition assignment operator --> a = a + 5(long hand) --> a += 5 (short hand)
            // a = 10
            //  a = a + 5; --> at backend it will solve right hand first and then assign it to left hand
            // a + 5 = 15 --> a = 15
            // output : a = 15  

            // -= subtraction assignment operator --> a = a - 5 --> a -= 5
            // output : a = 10

            // *= multiplication assignment operator --> a = a * 5 --> a *= 5
            // output : a = 50

            // /= division assignment operator --> a = a / 5 --> a /= 5
            // output : a = 10
    // Comparison Operators --> ==, !=, >, <, >=, <=
            // == equal to
            // != not equal to
            // > greater than
            // < less than
            // >= greater than or equal to
            // <= less than or equal to

            // equal to
            // int a = 10;
            // int b = 15;
            // System.out.println(a == b); // false
             // a = 10
             // b = 10
                // System.out.println(a == b); // true
             
            // not equal to
            // int a = 10;
            // int b = 15;
            // System.out.println(a != b); // true
             // a = 10
             // b = 10
                // System.out.println(a != b); // false
            

            // greater than
            // int a = 10;
            // int b = 15;
            // System.out.println(a > b); // false
             // a = 10
             // b = 10
                // System.out.println(a > b); // false
            // a = 15
            // b = 10
                // System.out.println(a > b); // true

            // less than
            // int a = 10;
            // int b = 15;
            // System.out.println(a < b); // true
             // a = 10
             // b = 10
                // System.out.println(a < b); // false
            
            // greater than or equal to
            // int a = 10;
            // int b = 15;
            // System.out.println(a >= b); // false
             // a = 10
             // b = 10
                // System.out.println(a >= b); // true
            // a = 15
            // b = 10
                // System.out.println(a >= b); // true
            
            // less than or equal to
            // int a = 10;
            // int b = 15;
            // System.out.println(a <= b); // true
             // a = 10
             // b = 10
                // System.out.println(a <= b); // true
            // a = 15
            // b = 10
                // System.out.println(a <= b); // false

    // inc
            
    // Logical Operators --> &&, ||, !

            // && --> and
            // int a = 10;
            // int b = 15;
            // System.out.println(a < 15 && b > 10); // true
            // System.out.println(a < 15 && b < 10); // false
            // System.out.println(a > 15 && b > 10); // false
            // System.out.println(a > 15 && b < 10); // false
        
            // || --> or
            // int a = 10;
            // int b = 15;
            // System.out.println(a < 15 || b > 10); // true
            // System.out.println(a < 15 || b < 10); // true
            // System.out.println(a > 15 || b > 10); // true
            // System.out.println(a > 15 || b < 10); // false

            // || --> or
            // int a = 10;
            // int b = 15;
            // System.out.println(a < 15 || b > 10); // true
            // System.out.println(a < 15 || b < 10); // true
            // System.out.println(a > 15 || b > 10); // false
            // System.out.println(a > 15 || b < 10); // false

            // ! --> not
            // int a = 10;
            // int b = 15;
            // System.out.println(!(a < 15)); // false
            // System.out.println(!(a > 15)); // true
            // System.out.println(!(a == 15)); // true
            // System.out.println(!(a != 15)); // false
    // Bitwise Operators --> &, |, ^, ~, <<, >>

    public static void main(String[] args) {
        int a = 10;
        // arithmetic operators
        System.out.println(a + 5); // 15
        System.out.println(a - 5); // 5
        System.out.println(a * 5); // 50
        System.out.println(a / 5); // 2
        System.out.println(a % 5); // 0

        // assignment operators
        System.out.println(a = a + 5); // 15
        System.out.println(a = a - 5); // 10
        System.out.println(a = a * 5); // 50
        System.out.println(a = a / 5); // 10
        System.out.println(a = a % 5); // 0

    }
}