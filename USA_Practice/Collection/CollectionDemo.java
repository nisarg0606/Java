package USA_Practice.Collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Reyaansh");
        list.add("Soham");
        list.add("Nidish");
        list.add("Milan");
        Iterator<String> it = list.iterator();
        System.out.println("before sorting...");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Collections.sort(list);
        System.out.println("After Sorting...");
        for (String string : list) {
            System.out.println(string);
        }
        System.out.println("Reversing the List...");
        Collections.reverse(list);
        for (String string : list) {
            System.out.println(string);
        }
        System.out.println(list.size());
        // list.forEach(list -> System.out.println(list));
    }
}

class VectorWithStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("A");
        stack.add("B");
        stack.add("C");
        stack.add("D");
        stack.add("E");
        stack.push("F");
        stack.add("A");
        stack.add("B");
        stack.add("C");
        stack.add("D");
        stack.add("E");
        stack.push("F");
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        stack.pop();
        itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(stack.peek()); // get the last element on the stack
        System.out.println(stack.capacity());
    }
}

class CollectionQueue {
    public static void main(String[] args) {
        // Queue<String> queue = new Queue<String>();
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Soham");
        queue.add("Nidish");
        queue.add("Milan");
        queue.add("Reyaansh");
        for (String names : queue) {
            System.out.println(names);
        }
        Queue<Integer> iq = new PriorityQueue<>();
        iq.add(10);
        iq.add(15);
        iq.add(5);
        iq.add(1);
        for (Integer integer : iq) {
            System.out.println(integer);
        }
        iq.clear();
        ArrayDeque<Integer> dqQueue = new ArrayDeque<>();
        dqQueue.addFirst(1);
        dqQueue.addFirst(2);
        dqQueue.addLast(4);
        dqQueue.add(5);
        for (Integer dequeInteger : dqQueue) {
            System.out.println(dequeInteger);
        }
    }
}
