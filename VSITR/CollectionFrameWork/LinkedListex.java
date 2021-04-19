/*
    Author: Nisarg Shah
    Topic:  7.3 Implement LinkedList operations : add(), remove(), addAll(), removeAll(), 
            removeFirst(), removeLast().
            1) Initially add 8 elements to the LinkedList and print it.
            2) Remove any three elements from the LinkedList and print the updated
            LinkedList.
            3) Create another LinkedList , add 3 more elements to it. Print it.
            4) Add all these newly added elements from second LinkdList to the first 
            LinKedList. Print the updated LinkedList.
            5) Remove all the elements from the LinkedList. Print the updated 
            LinkedList.
    DOE:    19-04-2021
*/
package VSITR.CollectionFrameWork;
import java.util.LinkedList;
public class LinkedListex {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("a");
        l1.add("b");
        l1.add("c");
        l1.add("d");
        l1.add("e");
        l1.add("f");
        l1.add("g");
        l1.add("h");
        System.out.println("Printing the elements of l1...");
        System.out.println(l1);
        l1.removeLast();
        l1.remove("g");
        l1.removeFirst();
        System.out.println("\nDisplaying after removing the 3 elements");
        System.out.println(l1);
        LinkedList<String> l2 = new LinkedList<String>();
        l2.add("i");
        l2.add("j");
        l2.add("k");
        System.out.println("\nPrinting the elements of l2...");
        System.out.println(l2);
        l1.addAll(l2);
        System.out.println("\nPrinting the elements after adding all the elements of l2 to l1...");
        System.out.println(l1);
        l1.removeAll(l1);
        System.out.println("\nRemoving all the elements of l1....");
        if (l1.size() == 0)
            System.out.println("The List is empty...");
        else
            System.out.println(l1);
    }
}
/*
    OUTPUT:
        Printing the elements of l1...
        [a, b, c, d, e, f, g, h]

        Displaying after removing the 3 elements
        [b, c, d, e, f]

        Printing the elements of l2...
        [i, j, k]

        Printing the elements after adding all the elements of l2 to l1...
        [b, c, d, e, f, i, j, k]

        Removing all the elements of l1....
        The List is empty...
*/