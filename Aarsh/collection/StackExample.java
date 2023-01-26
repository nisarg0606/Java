package aarsh.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        integers.push(1);
        integers.push(2);
        integers.push(3);
        integers.push(4);
        integers.push(5);
        // Iterator<Integer> itr = integers.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }
        System.out.println(integers);
    }
}
