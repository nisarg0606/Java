package RahulSir.Practice;

import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<String> it = new ArrayList<String>();
        it.add("a");
        it.add("b");
        it.add("c");
        it.add("d");
        it.add("e");
        it.add("f");
        for (String string : it) {
            System.out.println(string);
        }
    }
}
/*
    OUTPUT:
    a
    b
    c
    d
    e
    f
*/