package RahulSir.Practice;

import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("f");
        System.out.println("Updating the f with e: " + list);
        list.set(4, "e");
        System.out.println("After Updating the f with e: " + list);
    }
}
/*
    OUTPUT:
    Updating the f with e: [a, b, c, d, f]
    After Updating the f with e: [a, b, c, d, e]
*/