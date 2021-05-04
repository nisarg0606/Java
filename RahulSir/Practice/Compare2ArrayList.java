package RahulSir.Practice;

import java.util.ArrayList;

public class Compare2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nisarg");
        list.add("Japan");
        list.add("Sahil");
        list.add("Pavan");
        list.add("Amiraj");
        System.out.println(list);
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Nisarg");
        list2.add("Japan");
        list2.add("Sahil");
        list2.add("Pavan");
        list2.add("Amiraj");
        System.out.println("Before Adding xyz comparing list: ");
        boolean compare = list.equals(list2);
        System.out.println(compare);
        System.out.println("After Adding xyz comparing list: ");
        list.add("xyz");
        compare = list.equals(list2);
        System.out.println(compare);
    }
}
