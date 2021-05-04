package RahulSir.Practice;

import java.util.ArrayList;

public class Q15 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nisarg");
        list.add("Japan");
        list.add("Sahil");
        list.add("Pavan");
        list.add("Amiraj");
        System.out.println("Printing list: "+list);
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Shrey");
        list1.add("Raj");
        list1.add("Viraj");
        System.out.println("Printing list1: "+list1);
        list.addAll(list1);
        System.out.println("Printing list after adding list1: "+list);
    }
}
/*
OUTPUT:
    Printing list: [Nisarg, Japan, Sahil, Pavan, Amiraj]
    Printing list1: [Shrey, Raj, Viraj]
    Printing list after adding list1: [Nisarg, Japan, Sahil, Pavan, Amiraj, Shrey, Raj, Viraj]
*/