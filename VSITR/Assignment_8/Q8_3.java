/*      
    Author: Nisarg Shah
    Topic:  8.3 Create an Array List with name numbers. Add 5 numbers of type Integer 
            and calculate the size of ArrayList.
    DOC:    29-04-2021
*/
package VSITR.Assignment_8;
import java.util.ArrayList;
public class Q8_3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Size of ArrayList: "+numbers.size());
    }
}
/*
    OUTPUT:
        Size of ArrayList: 5
*/