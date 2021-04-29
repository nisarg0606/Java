/*
    Author: Nisarg Shah
    Topic:  8.1 Create an ArrayList with name CSLanguages. Add 5 computer science
            languages of type String.Iterate through the languages using for-each loop 
            and print those languages.
    DOC:    29-04-2021
*/
package VSITR.Assignment_8;
import java.util.ArrayList;
public class Q8_1 {
    public static void main(String[] args) {
        ArrayList<String> CSLanguages = new ArrayList<>();
        CSLanguages.add("C");
        CSLanguages.add("C++");
        CSLanguages.add("Java");
        CSLanguages.add("Python");
        CSLanguages.add("GO");
        for (String iter : CSLanguages) {
            System.out.println(iter);
        }
    }
}

/*
    OUTPUT:
    C
    C++ 
    Java
    Python
    GO
*/