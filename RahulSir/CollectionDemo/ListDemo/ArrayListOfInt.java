package RahulSir.CollectionDemo.ListDemo;

import java.util.ArrayList;

public class ArrayListOfInt {
    public static void main(String[] args) {
        ArrayList<Integer> ai = new ArrayList<Integer>();
        ai.add(10);
        ai.add(20);
        ai.add(30);
        for (int i = 0; i < ai.size(); i++) {
            Object oi = ai.get(i);
            System.out.println(oi);
        }
    }
}