package VSITR;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");
        for (int i = 0; i < al.size(); i++) {
            System.out.println("Returing elements: "+al.get(i));
        }
        al.set(0, "Lichi");
        for (int i = 0; i < al.size(); i++) {
            System.out.println("Returing elements: "+al.get(i));
        }
    }
}
