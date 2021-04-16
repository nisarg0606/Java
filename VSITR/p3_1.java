package VSITR;

import java.util.*;

public class p3_1 {

    static final int MAX = 100;
    int top = -1;
    int f;
    int pos = -1;

    int[] stack = new int[MAX];

    public static void main(String args[]) {
        p3_1 s1 = new p3_1();
        int ch, value;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("1. PUSH ");
            System.out.println("2. POP ");
            System.out.println("3. PEEP ");
            System.out.println("4. DISPLAY STACK ");
            System.out.println("5. EXIT ");
            System.out.println("6. SEARCH");
            System.out.print("Enter Your Option: ");
            ch = s.nextInt();
            switch (ch) {
            case 1:
                System.out.print("Enter the valueue which you want to push : ");
                value = s.nextInt();
                s1.push(value);
                break;

            case 2:
                s1.pop();
                break;

            case 3:
                s1.peep();
                break;

            case 4:
                s1.display();
                break;

            case 6:
                s1.search();
                break;
            }
        } while (ch != 5);
        s.close();
    }

    void push(int value) {
        if (top == MAX - 1) {
            System.out.println("Stack is FULL!");
        } else {
            top++;
            stack[top] = value;
            System.out.println("Element added to the stack is: " + value);
            display();
        }
    }

    void pop() {
        int d;
        if (top == -1) {
            System.out.println("Stack is EMPTY!");
        } else {
            d = stack[top];
            System.out.println("The element deleted from the stack : " + d);
            top--;
            display();
        }
    }

    void peep() {
        int p;
        p = stack[top];
        System.out.println("The valueue at the top of the stack : " + p);
    }

    void search() {
        int j;
        if (top == -1) {
            System.out.println("Stack is Underflow");
        } else {
            System.out.println("Enter the value which you want to search : ");
            Scanner sc = new Scanner(System.in);
            int f = sc.nextInt();
            sc.close();
            for (j = 0; j <= top; j++) {
                if (f == stack[j]) {
                    pos = j + 1;
                    break;
                }
            }
            if (pos == -1) {
                System.out.println("Sorry !the value you entered is not in the stack");
            } else {
                System.out.println("Your value is found at position :" + pos);
            }
        }

    }

    void display() {
        int i;
        if (top == -1)
            System.out.println("STACK IS EMPTY!");
        else {
            for (i = 0; i <= top; i++)
                System.out.println("The elements in the stack : " + stack[i]);
        }

    }

}