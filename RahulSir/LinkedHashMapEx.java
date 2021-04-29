package RahulSir;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> LHM = new LinkedHashMap<>();
        LHM.put(1, "Nisarg");
        LHM.put(5, "Anil");
        LHM.put(2, "Japan");
        LHM.put(4, "Jap");
        LHM.put(3, "Sahil");
        for (Map.Entry<Integer, String> m : LHM.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("LHM.keySet()    " + LHM.keySet());
        System.out.println("LHM.values()    " + LHM.values());
        System.out.println("LHM.entrySet()  " + LHM.entrySet());
        LHM.remove(1);
        System.out.println("After Removing: ");
        for (Map.Entry<Integer, String> m : LHM.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}