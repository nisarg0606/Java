package RahulSir.Practice;

import java.util.ArrayList;

public class Remove3rdElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("f");
        System.out.println("Before removing 3rd element: "+list);
        list.remove(3);
        System.out.println("After removing 3rd element: "+list);
    }
}
