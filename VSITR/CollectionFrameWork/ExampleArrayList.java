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
        ArrayList<Integer> ExampleArrayList = new ArrayList<Integer>();
        ExampleArrayList.add(1);
        ExampleArrayList.add(2);
        ExampleArrayList.add(3);
        ExampleArrayList.add(4);
        ExampleArrayList.add(5);
        for (Integer integer : ExampleArrayList) {
            System.out.print(integer+"  ");
        }
        System.out.println();
        // System.out.println(ExampleArrayList);
        System.out.println("Removing all elements...");
        ExampleArrayList.removeAll(ExampleArrayList);
        if (ExampleArrayList.size() == 0)
            System.out.println("The ArrayList is empty...");
        else
            for (int j = 0; j < ExampleArrayList.size(); j++) {
                System.out.print(ExampleArrayList.get(j));
            }
    }
}
/*
    OUTPUT: 
        1 2 3 4 5 
        Removing all elements...
        The ArrayList is empty...
 */