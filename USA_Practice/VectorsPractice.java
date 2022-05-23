package USA_Practice;
import java.util.Vector;
public class VectorsPractice {
    /** Vectors are dynamic Array and you can take any data type for that....
     * you can insert any number of data into vectors
     * // it allocates and deallocated the memory according
     */// Vector<Integer> intVector = new Vector<Integer>(3);
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();// different different methods that are important for learning vectors...
        System.out.println("Students in USA Java Batch");
        v.addElement("Soham");
        v.addElement("Reyaansh");
        v.addElement("Nidish");
        v.addElement("Milan");
        v.addElement("Kairavy");
        System.out.println(v);
        System.out.println("Student at 3rd index is: " + v.elementAt(3));
        System.out.println("The size of the vector is: " + v.size());
        System.out.println("Removing " + v.get(4) + " from this batch due to her board exams");
        v.remove("Kairavy");
        System.out.println(v);
        String[] str = new String[v.size()];
        v.copyInto(str);// copying vector into array
        for (String string : v) {
            System.out.println(string);}
        v.insertElementAt("Neev", 2);
        System.out.println(v);
        v.clear();
        System.out.println(v);
    }}