package RahulSir;

// import java.util.HashMap;
// import java.util.Map;
import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(101, "Nisarg");
        map.put(105, "Anil");
        map.put(106, "Japan");
        map.put(102, "Jap");
        map.put(113, "Sahil");
        for(Map.Entry<Integer, String> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        map.putIfAbsent(6, "Putting Sample value");
        System.out.println("----------------");
        for(Map.Entry<Integer, String> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        map.put(5, "Removing Anil");
        System.out.println("----------------");
        for(Map.Entry<Integer, String> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        map.remove(5);
        map.remove(6, "Putting Sample value");
        System.out.println("----------------");
        for(Map.Entry<Integer, String> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}