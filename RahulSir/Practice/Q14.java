package RahulSir.Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Q14 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nisarg");
        list.add("Japan");
        list.add("Sahil");
        list.add("Pavan");
        list.add("Amiraj");
        System.out.println("Before Swapping: ");
        System.out.println(list);
        Collections.swap(list, 0, 3);
        System.out.println("After Swapping: ");
        System.out.println(list);
    }
}
/**
    OUTPUT:
    Before Swapping: 
    [Nisarg, Japan, Sahil, Pavan, Amiraj]
    After Swapping: 
    [Pavan, Japan, Sahil, Nisarg, Amiraj]
 */