/*
    Author: Nisarg Shah
    Topic: Example of vectors for understanding vectors
    DOC: 20-04-2021
*/
package RahulSir;

import java.util.Iterator;
import java.util.Vector;
public class VectorListex {
    public static void main(String[] args) {
        Vector<String> vObject = new Vector<String>();
        vObject.add("Nisarg");
        vObject.add("Shah");
        vObject.add("Japan");
        vObject.add("Ekta");
        vObject.add("Heli");
        Iterator<String> it = vObject.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
        System.out.println(vObject.capacity());
        System.out.println(vObject.hashCode());
    }
}
