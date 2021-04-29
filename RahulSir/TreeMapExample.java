package RahulSir;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(1, "Nisarg");
        tree.put(5, "Anil");
        tree.put(2, "Japan");
        tree.put(4, "Jap");
        tree.put(3, "Sahil");
        for (Map.Entry<Integer, String> entry : tree.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
        tree.putIfAbsent(6, "Putting Sample value");
        System.out.println("----------------");
        for (Map.Entry<Integer, String> entry : tree.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
        tree.put(5, "Removing Anil");
        System.out.println("----------------");
        for (Map.Entry<Integer, String> entry : tree.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
        tree.remove(5);
        tree.remove(6, "Putting Sample value");
        System.out.println("----------------");
        for (Map.Entry<Integer, String> entry : tree.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }
}