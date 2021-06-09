package VSITR.Revision;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> ArrayList1 = new ArrayList<>();
        Collections.addAll(ArrayList1, 1, 2, 3, 4, 5);
        System.out.println("The Elements in the Arraylist1 are: " + ArrayList1);
        ArrayList<Integer> ArrayList2 = new ArrayList<>();
        Collections.addAll(ArrayList2, 6, 7, 8, 9);
        System.out.println("The Elements in the Arraylist2 are: " + ArrayList2);
        ArrayList1.addAll(ArrayList2);
        System.out.println("After Updating Arraylist1: " + ArrayList1);
        ArrayList1.clear();
        System.out.println("After Removing all the elements from Arraylist1: " + ArrayList1);
    }
}