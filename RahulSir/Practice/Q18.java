package RahulSir.Practice;

import java.util.ArrayList;

public class Q18 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nisarg");
        list.add("Japan");
        list.add("Sahil");
        list.add("Pavan");
        list.add("Amiraj");
        System.out.println(list);
        if (list.isEmpty() == true)
            System.out.println("The list is empty...");
        else {
            System.out.println("The List is not empty...");
            System.out.println(list);
        }
        list.removeAll(list);
        System.out.println("Now removing all elements....");
        if (list.isEmpty() == true)
            System.out.println("The list is empty...");
        else {
            System.out.println("The List is not empty...");
            System.out.println(list);
        }
    }
}
/*
OUTPUT:
    [Nisarg, Japan, Sahil, Pavan, Amiraj]
    The List is not empty...
    [Nisarg, Japan, Sahil, Pavan, Amiraj]
    Now removing all elements....
    The list is empty...
*/