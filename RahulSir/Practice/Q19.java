package RahulSir.Practice;

import java.util.ArrayList;

public class Q19 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(30);
        list.add("Nisarg");
        list.add("Japan");
        list.add("Sahil");
        list.add("Pavan");
        list.add("Amiraj");
        System.out.println(list);
        System.out.println("The size of the list is: "+list.size());
        list.trimToSize();
        System.out.println("After triming to original, the list is: "+list.size());
        System.out.println(list);
    }
}
/*
OUTPUT:
    [Nisarg, Japan, Sahil, Pavan, Amiraj]
    The size of the list is: 5
    After triming to original, the list is: 5
    [Nisarg, Japan, Sahil, Pavan, Amiraj]
*/