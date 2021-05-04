package RahulSir.Practice;

import java.util.ArrayList;

public class Q6 {
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
/*
OUTPUT:
    Before removing 3rd element: [a, b, c, d, f]
    After removing 3rd element: [a, b, c, f]
*/