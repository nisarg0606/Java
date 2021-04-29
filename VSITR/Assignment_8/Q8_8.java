/*      
    Author: Nisarg Shah
    Topic:  8.8 Implement a treeset to retrieve and remove the highest and lowest value.
    DOC:    29-04-2021
*/
package VSITR.Assignment_8;
import java.util.TreeSet;
public class Q8_8 {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(10);
        t.add(100);
        t.add(1000);
        t.add(10000);
        t.add(100000);
        System.out.println("TreeSet: "+t);
        System.out.println("Lowest Value: " + t.pollFirst());
        System.out.println("Highest Value: " + t.pollLast());
        System.out.println("After Removing Highest and Lowest Elements from TreeSet: "+t);
    }
}
/*
    OUTPUT:
        TreeSet: [10, 100, 1000, 10000, 100000]
        Lowest Value: 10
        Highest Value: 100000
        After Removing Highest and Lowest Elements from TreeSet: [100, 1000, 10000]
*/