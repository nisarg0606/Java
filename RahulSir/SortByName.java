package RahulSir;

import java.util.ArrayList;
import java.util.Collections;

public class SortByName {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Nisarg",12);
        Student s4 = new Student(4,"Pavan",11);
        Student s2 = new Student(2,"Japan",10);
        Student s3 = new Student(3,"Sahil",9);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s4);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            Student s  =list.get(i);
            System.out.println(s);
        }
        Collections.sort(list);
        System.out.println("After Sorting: ");
        for (int i = 0; i < list.size(); i++) {
            Student s  =list.get(i);
            System.out.println(s);
        }
    }
}
