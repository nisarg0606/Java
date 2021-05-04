package RahulSir.Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Q11 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nisarg");
        list.add("Japan");
        list.add("Sahil");
        list.add("Pavan");
        list.add("Amiraj");
        System.out.println("Before Reversing: ");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("After Reversing: ");
        System.out.println(list);
    }
}
/*
OUTPUT:
    Before Reversing: 
    [Nisarg, Japan, Sahil, Pavan, Amiraj]
    After Reversing:
    [Amiraj, Pavan, Sahil, Japan, Nisarg]
*/