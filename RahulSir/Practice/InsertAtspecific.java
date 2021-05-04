package RahulSir.Practice;

import java.util.ArrayList;

public class InsertAtspecific {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("d");
        list.add("e");
        System.out.println("Before Adding the element ar 2nd position: " + list);
        list.add(2, "c");
        System.out.println("After Adding the element ar 2nd position: " + list);
    }
}