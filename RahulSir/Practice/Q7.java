package RahulSir.Practice;

import java.util.ArrayList;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("f");  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an element you want to search for: ");
        String search = sc.nextLine();
        sc.close();
        int flag = 0,i=0;
        for (;i<list.size(); i++) {
            if(search.equalsIgnoreCase(list.get(i)))
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println(list.get(i)+" founded at index "+i);
        }
        else{
            System.out.println("No element found");
        }
    }
}
/*
OUTPUT:
    Enter an element you want to search for: b
    b founded at index 1
*/