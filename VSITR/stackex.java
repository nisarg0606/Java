package VSITR;
import java.util.Stack;
public class stackex {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Initial Stack: " + s);
        System.out.println("The element at the top of the stack is: " + s.peek());
        System.out.println("Final Stack: " + s);
        System.out.println("Popped element:" + s.pop());
    }
}