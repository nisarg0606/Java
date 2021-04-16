package RahulSir.CollectionDemo.ListDemo;
import java.util.*;

import IODemo.Student;
public class ArraList {
    public static void main(String[] args) {
        Student s = new Student(1,"Nisarg", 12);
        ArrayList<String> list = new ArrayList<String>();
        list.add("10");
        list.add("10.543");
        list.add("true");
        list.add("nisarg");
        list.add("n");
        list.add("s");
        // ArrayList list1 = new ArrayList();
        // list1.add(10);
        // list1.add(10.543);
        // list1.add(true);
        // list1.add("nisarg");
        // list1.add("n");
        // list1.add("s");
        System.out.println("List size is of "+list.size());
        System.out.println(list.get(3));
        
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            if(o instanceof Student)
            {
                s=(Student)o;
                System.out.println(s.getRno()+" "+s.getName()+" "+s.getstd());
            }
            else{
                System.out.println(o);
            }
        }
        // System.out.println("new list withour datatype i.e. raw data");
        // for (int i = 0; i < list1.size(); i++) {
        //     System.out.println(list1.get(i));
        // }
    }
}