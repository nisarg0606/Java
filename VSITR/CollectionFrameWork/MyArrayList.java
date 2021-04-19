/*
    Author: Nisarg Shah
    Topic:  7.1 Create an ArrayList with name MyArrayList. Add 5 elements of type String. 
            Print all the elements using get().
    DOE:    19-04-2021
*/
package VSITR.CollectionFrameWork;
import java.util.ArrayList;
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nisarg");   
        list.add("Rutvik");   
        list.add("Sakar");   
        list.add("Jay");   
        list.add("Jainam");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
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