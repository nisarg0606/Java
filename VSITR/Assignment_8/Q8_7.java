/*      
    Author: Nisarg Shah
    Topic:  8.7 Create a treeset with names of five vegetables of type string. 
            Traverse the elements of treeset in descending order.
    DOC:    29-04-2021
*/
package VSITR.Assignment_8;
import java.util.TreeSet;
public class Q8_7 {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>();
        t.add("Potato");
        t.add("Tomato");
        t.add("Onion");
        t.add("Ginger");
        t.add("CauliFlower");
        System.out.println("TreeSet: "+t.descendingSet());
    }
}
/*
    OUTPUT: 
        TreeSet: [Tomato, Potato, Onion, Ginger, CauliFlower]
*/