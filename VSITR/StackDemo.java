package VSITR;

import java.util.Stack;
import java.util.*;

class StackDemo {
    public static void main(String args[]) {
        int ch;
        Scanner s = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        do {
            System.out.println("Enter 1 for push ");
            System.out.println("Enter 2 for pop ");
            System.out.println("Enter 3 for peek ");
            System.out.println("Enter 4 for search ");
            System.out.println("Enter 5 for display ");
            System.out.println("Enter 6 for Exit");
            System.out.println("Please enter your choice:- ");
            ch = s.nextInt();
            switch (ch) {
            case 1:
                System.out.println("Enter your no: ");
                int i = s.nextInt();
                stack.push(i);
                break;
            case 2:
                stack.pop();
                break;
            case 3:
                stack.peek();
                break;
            case 4:
                System.out.print("Enter the number:- ");
                int se = s.nextInt();
                System.out.println("The number you searched for is on index " + stack.search(se));
                break;
            case 5:
                System.out.println("Stack values: " + stack);
                break;
            case 6:
                System.out.println("Thank you visit again");
                break;
            default:
                System.out.println("Enter valid option:");
            }
        } while (ch != 6);
        s.close();
    }
}