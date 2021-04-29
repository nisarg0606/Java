package RahulSir;
import java.util.*;
public class HashSetExample {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(1);
		set.add(2);
		set.add(1);
		set.add(3);
		set.add(4);
		set.add(3);
		set.add(5);
		set.add(6);
		set.add(9);
		set.add(5);	
		System.out.println("set.size() - "+set.size());
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) 
		{
			Integer value = (Integer) itr.next();
			System.out.println(value);
		}
    }
}