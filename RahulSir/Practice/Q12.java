package RahulSir.Practice;

import java.util.ArrayList;

public class Q12 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nisarg");
        list.add("Japan");
        list.add("Sahil");
        list.add("Pavan");
        list.add("Amiraj");
        System.out.println("Complete list: ");
        System.out.println(list);
        System.out.println("Portion of a list: ");
        System.out.println(list.subList(0, 3));
    }
}
/*
OUTPUT:
    Complete list: 
    [Nisarg, Japan, Sahil, Pavan, Amiraj]
    Portion of a list:
    [Nisarg, Japan, Sahil]
*/