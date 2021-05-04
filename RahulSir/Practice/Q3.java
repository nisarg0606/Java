/**
 * Topic: 3. Write a Java program to insert an element into the array list at the first position. 
 */
package RahulSir.Practice;

import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println("Before Adding the element at 0th position: " + list);
        list.add(0, "a");
        System.out.println("After Adding the element at 0th position: " + list);
    }
}
/*
    OUTPUT:
        Before Adding the element at 0th position: [b, c, d, e]
        After Adding the element at 0th position: [a, b, c, d, e]
*/