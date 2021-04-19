/*
    Author: Nisarg Shah
    Topic:  7.4 Implement TreeSet. Enter nodes. Print Initial set, reverse set, headset, subset 
            and tailset .
    DOE:    19-04-2021
*/
package VSITR.CollectionFrameWork;
import java.util.TreeSet;
public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        System.out.println("Printing ts....");
        System.out.println(ts);
        System.out.println("Printing ts in descending order....");
        System.out.println(ts.descendingSet());
        System.out.println("Printing ts till headset....");
        System.out.println(ts.headSet(3));
        System.out.println("Printing ts subset....");
        System.out.println(ts.subSet(2, 4));
        System.out.println("Printing ts from tailset....");
        System.out.println(ts.tailSet(4));
    }
}

/*
    OUTPUT:
        Printing ts....
        [1, 2, 3, 4, 5]
        Printing ts in descending order....
        [5, 4, 3, 2, 1]
        Printing ts till headset....
        [1, 2]
        Printing ts subset....
        [2, 3]
        Printing ts from tailset....
        [4, 5]
*/