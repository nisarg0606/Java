package RahulSir.Practice;

import java.util.ArrayList;

public class Q22 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nisarg");
        list.add("Japan");
        list.add("Sahil");
        list.add("Pavan");
        list.add("Amiraj");
        System.out.println(list);
        System.out.println("Now printing elements according to postion i.e. Index: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index[" + i + "]: " + list.get(i));
        }
    }
}
/*
OUTPUT:
    [Nisarg, Japan, Sahil, Pavan, Amiraj]
    Now printing elements according to postion i.e. Index: 
    Index[0]: Nisarg
    Index[1]: Japan
    Index[2]: Sahil
    Index[3]: Pavan
    Index[4]: Amiraj
*/