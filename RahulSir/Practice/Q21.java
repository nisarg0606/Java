package RahulSir.Practice;

import java.util.ArrayList;

public class Q21 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nisarg");
        list.add("Japan");
        list.add("Sahil");
        list.add("Pavan");
        list.add("Amiraj");
        System.out.println("Before Replacing: "+list);
        list.set(2, "Replacing Sahil");
        System.out.println("After Replacing: "+list);
    }
}
/*
OUTPUT:
    Before Replacing: [Nisarg, Japan, Sahil, Pavan, Amiraj]
    After Replacing: [Nisarg, Japan, Replacing Sahil, Pavan, Amiraj]
*/