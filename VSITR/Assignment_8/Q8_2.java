/*
    Author: Nisarg Shah
    Topic:  8.2 Create an ArrayList with name fruits. Add 5 fruits of type String namely 
            mango, banana, chickoo, grapes and orange. Instead of chickoo add pineapple to 
            the arraylist and print the updated list .
    DOC:    29-04-2021
*/
package VSITR.Assignment_8;
import java.util.ArrayList;
public class Q8_2 {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("mango");
        fruit.add("banana");
        fruit.add("chickoo");
        fruit.add("grapes");
        fruit.add("orange");
        System.out.println("ArrayList: "+fruit);
        fruit.set(2, "pineapple");
        System.out.println("Updated ArrayList: "+fruit);
    }
}
/* 
    OUTPUT:
        ArrayList: [mango, banana, chickoo, grapes, orange]
        Updated ArrayList: [mango, banana, pineapple, grapes, orange]
*/