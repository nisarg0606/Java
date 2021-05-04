package RahulSir.Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Q10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nisarg");
        list.add("Japan");
        list.add("Sahil");
        list.add("Pavan");
        list.add("Amiraj");
        System.out.println("Before Shuffling: ");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println("After Shuffling: ");
        System.out.println(list);
    }
}
/*
OUTPUT:
    Before Shuffling: 
    [Nisarg, Japan, Sahil, Pavan, Amiraj]
    After Shuffling:
    [Pavan, Sahil, Amiraj, Japan, Nisarg]
*/