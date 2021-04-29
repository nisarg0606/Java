/*      
Author: Nisarg Shah
Topic:  8.4 Create a linked list named animals. Add 5 animals namely cow, 
        buffalo, goat, camel and donkey of type String. Then remove buffalo from 
        the linked list. Then remove the animal at index 3. After that remove the
        first animal and the last animal. Print the updated linked list.
DOC:    29-04-2021
*/
package VSITR.Assignment_8;
import java.util.ArrayList;
public class Q8_4 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Cow");
        animals.add("Buffalo");
        animals.add("Goat");
        animals.add("Camel");
        animals.add("Donkey");
        System.out.println("LinkedList: "+animals);
        animals.remove("Buffalo");
        System.out.println("After Removing BUffalo: "+animals);
        animals.remove(3);
        System.out.println("After Removing element at index 3: "+animals);
        animals.remove(0);
        System.out.println("After Removing first element: "+animals);
        int last = animals.size();
        animals.remove(last-1);
        System.out.println("After Removing last element: "+animals);
    }
}
/**
    OUTPUT:
        LinkedList: [Cow, Buffalo, Goat, Camel, Donkey]
        After Removing BUffalo: [Cow, Goat, Camel, Donkey]
        After Removing element at index 3: [Cow, Goat, Camel]
        After Removing first element: [Goat, Camel]
        After Removing last element: [Goat]
 */