package VSITR;
import java.util.Vector;
public class vectors_method {
    public static void main(String[] args) {
        Vector<String> Student = new Vector<String>();
        Student.insertElementAt("Mobile", 0);
        Student.addElement("Laptop");
        Student.addElement("Watch");
        Student.addElement("Shoes");
        Student.addElement("T-shirt");
        Student.addElement("Jeans");
        System.out.println("Before removing Jeans : ");
        System.out.println("Vector elements are : " + Student);
        if (Student.remove("Jeans")) {
            System.out.println("After removing Jeans : ");
            System.out.println("Vector elements are : " + Student);
        }
    }
}