package RahulSir.CollectionDemo;
import java.util.Iterator;
import java.util.PriorityQueue;
public class TestPriorityQueue {
	public static void main(String[] args) 
	{
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("rahul");
		queue.add("ankur");
		queue.add("brijesh");
		queue.add("rakesh");
		queue.add("ajay");
		queue.add("parth");
		
		Iterator<String> itr =  queue.iterator();
		queue.remove();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		queue.peek();
		System.out.println(queue);
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}