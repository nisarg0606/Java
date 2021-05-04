package RahulSir.Practice;

import java.util.ArrayList;

public class Q9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nisarg");
        list.add("Japan");
        list.add("Sahil");
        list.add("Pavan");
        list.add("Amiraj");
        System.out.println(list);
        ArrayList<String> listcopy = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            listcopy.add(list.get(i));
        }
        System.out.println("After Coping: ");
        System.out.println(listcopy);
    }
}
/*
OUTPUT:
    [Nisarg, Japan, Sahil, Pavan, Amiraj]
    After Coping: 
    [Nisarg, Japan, Sahil, Pavan, Amiraj]
*/