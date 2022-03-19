package DivaKhushi;

/*
 * What is the difference between a class and an interference??
 * In class there can be varibles method and methods can have body also varibles
 * can be initialize
 * but in interfaces you can just declare the method and varibles....
 * eg:
 * 
 */
import java.util.*;

public class ArrayListExample {
    public static void main(String args[]) {
        // Creating a List
        ArrayList<String> list = new ArrayList<String>();
        // Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        // Iterating the List element using for-each loop
        for (String fruit : list)
            System.out.println(fruit);

    }
}

// interface printable {
// void print();
// }

// class interfaceimp implements printable {
// public void print() {
// System.out.println("Hello");
// }

// public static void main(String[] args) {
// interfaceimp im = new interfaceimp();
// im.print();
// }
// }