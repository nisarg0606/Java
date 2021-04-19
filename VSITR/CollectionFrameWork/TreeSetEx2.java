/*
    Author: Nisarg Shah
    Topic:  7.5 Implement TreeSet. Enter 10 nodes with values from 1 to 10. Remove node 
            with value 5 and print the Treeset. Check whether the node has been removed 
            or not. Now remove all the elements from the Treeset and again print the 
            Treeset
    DOC:    19-04-2021
*/
package VSITR.CollectionFrameWork;
import java.util.TreeSet;
public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        ts.add(6);
        ts.add(7);
        ts.add(8);
        ts.add(9);
        ts.add(10);
        System.out.println("Displaying all the elements of ts....");
        System.out.println(ts);
        System.out.println("Removing 5 from ts....");
        ts.remove(5);
        System.out.println(ts);
        System.out.println("Removing all elements from ts....");
        ts.removeAll(ts);
        if (ts.size() == 0)
            System.out.println("The TreeSet is empty");
        else
            System.out.println(ts);
    }
}
/*
    Output:
        Displaying all the elements of ts....
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        Removing 5 from ts....
        [1, 2, 3, 4, 6, 7, 8, 9, 10]
        Removing all elements from ts....
        The TreeSet is empty
*/