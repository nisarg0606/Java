package VSITR.Revision;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        {
            LinkedList<String> ll1 = new LinkedList<String>();
            ll1.add("Nisarg");
            ll1.add("Rutvik");
            ll1.add("Yash");
            ll1.add("Sakar");
            ll1.add("Jay");
            ll1.add("Jainam");
            ll1.add("Deep");
            ll1.add("Dhruvin");

            System.out.println("The elements in the list1 are: " + ll1);

            ll1.removeLast();
            ll1.removeLast();
            ll1.removeLast();

            System.out.println("The elements in the list1 after removing 3 elements are: " + ll1);
            LinkedList<String> ll2 = new LinkedList<String>();
            ll2.add("Jainam2");
            ll2.add("Deep2");
            ll2.add("Dhruvin2");
            System.out.println("The elements in the list2 are: " + ll2);

            ll1.addAll(ll2);
            System.out.println("The elements in the list1 after adding list2 to it are: " + ll1);

            ll1.removeAll(ll1);
            System.out.println("The elements in the list1 after removing all elements are: " + ll1);
        }
    }
}