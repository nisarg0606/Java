/*
    Author: Nisarg Shah
    Topic:  7.1 Create an ArrayList with name MyArrayList. Add 5 elements of type String. 
            Print all the elements using get().
    DOC:    19-04-2021
*/
package VSITR.CollectionFrameWork;
import java.util.ArrayList;
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> MyarrayList = new ArrayList<String>();
        MyarrayList.add("Nisarg");   
        MyarrayList.add("Rutvik");   
        MyarrayList.add("Sakar");   
        MyarrayList.add("Jay");   
        MyarrayList.add("Jainam");
        for (int i = 0; i < MyarrayList.size(); i++) {
            System.out.println(MyarrayList.get(i));
        }   
    }
}
/*
    OUTPUT:
        Nisarg
        Rutvik
        Sakar
        Jay
        Jainam
*/