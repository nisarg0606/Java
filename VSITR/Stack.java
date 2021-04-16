package VSITR;
import java.util.Scanner;
public class Stack {
    int size = 5;
    int data[] = new int[size];
    int stackTop = -1;
    public void push()
    {
        Scanner sc = new Scanner(System.in);
        if(this.stackTop == this.size - 1)
        {
            System.out.println("Stack Overflow...");
        }
        else{
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            this.stackTop++;
            this.data[stackTop]= n;
        }
        sc.close();
    }
    public int pop()
    {
        if(this.stackTop == -1)
        {
            System.out.println("Stack Underflow...");
            return 0;
        }
        else
        {
            System.out.println("Removed number is: "+this.data[stackTop]);
            int n  = this.data[stackTop];
            this.stackTop--;
            return n;
        }
    }
    public void display()
    {
        System.out.println("Stack data is as follow:");
        if(this.stackTop == -1)
        {
            System.out.println("No items to display...");
        }
        for (int i = 0; i <= this.stackTop; i++) {
            System.out.println(this.data[i]);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push();
        s.push();
        s.push();
        s.push();
        s.push();
        s.push();
        s.display();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.display();
    }
}