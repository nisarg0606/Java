/*
    Author: Nisarg Shah
    Topic:  7.2 Create an ArrayList with name ExampleArrayList. Add 5 elements of type 
            Integer. Print all the elements of the ArrayList. Now remove all the elements 
            from this ArrayList and print the output.
    DOC:    19-04-2021
*/
package VSITR.CollectionFrameWork;
import java.util.ArrayList;
public class ExampleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<Integer>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        i.add(5);
        for (Integer integer : i) {
            System.out.print(integer+"  ");
        }
        System.out.println();
        // System.out.println(i);
        System.out.println("Removing all elements...");
        i.removeAll(i);
        if (i.size() == 0)
            System.out.println("The ArrayList is empty...");
        else
            for (int j = 0; j < i.size(); j++) {
                System.out.print(i.get(j));
            }
    }
}
/*
    OUTPUT: 
        1 2 3 4 5 
        Removing all elements...
        The ArrayList is empty...
 */