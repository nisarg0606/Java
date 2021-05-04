package RahulSir.Practice;

import java.util.ArrayList;

public class Q17 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nisarg");
        list.add("Japan");
        list.add("Sahil");
        list.add("Pavan");
        list.add("Amiraj");
        System.out.println(list);
        list.removeAll(list);
        System.out.println("Now removing each and every element...");
        if (list.size() == 0)
            System.out.println("The List is empty...");
        else
            System.out.println(list);
    }
}
/*
OUTPUT:
    [Nisarg, Japan, Sahil, Pavan, Amiraj]
    Now removing each and every element...
    The List is empty...
*/