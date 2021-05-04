package RahulSir.Practice;

import java.util.ArrayList;

public class Q16 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nisarg");
        list.add("Japan");
        list.add("Sahil");
        list.add("Pavan");
        list.add("Amiraj");
        System.out.println("Before cloning: ");
        System.out.println(list);
        System.out.println("After cloning: ");
        //commenting this as was receving a warning to run this code and want to get desired output uncommend the 2 lines below
        // ArrayList<String> list1 =(ArrayList)list.clone();
        // System.out.println(list1);
    }
}
/*
OUTPUT:
    Before cloning: 
    [Nisarg, Japan, Sahil, Pavan, Amiraj]
    After cloning:
    [Nisarg, Japan, Sahil, Pavan, Amiraj]
*/