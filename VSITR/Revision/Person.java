package VSITR.Revision;
import java.util.Scanner;
public class Person {
    private int id;
    private String name;
    private int age;
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println();
        System.out.println("Your Id is : "+ id);    System.out.println("Your Name is : "+ name);    System.out.println("Your Age is : "+ age);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter your id: ");    int id =  sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your name: ");  String name = sc.nextLine();
        System.out.print("Enter your age: ");   int age =  sc.nextInt();
        Person p1 = new Person(id, name);
        Person p2 = new Person(id,name, age);
        p1.display();
        p2.display();
        sc.close();
    }

}
