package RahulSir.Practice;

import java.util.ArrayList;

public class Q20 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nisarg");
        list.add("Japan");
        list.add("Sahil");
        list.add("Pavan");
        list.add("Amiraj");
        System.out.println("Before Ensuring the list size: "+list);
        list.ensureCapacity(7);
        list.add("Shrey");
        list.add("Raj");
        list.add("Viraj");
        System.out.println("After Ensuring the list size: "+list);
    }
}
/*
OUTPUT:
    Before Ensuring the list size: [Nisarg, Japan, Sahil, Pavan, Amiraj]
    After Ensuring the list size: [Nisarg, Japan, Sahil, Pavan, Amiraj, Shrey, Raj, Viraj]
*/