package VSITR;

public class Person {
    int id,age;
    String name;
    Person(int i, String n){
        id=i;
        name=n;
    }
    Person(int i, String n, int a)
    {
        id=i;
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println("ID: "+id+"\nName: "+name+"\nAge: "+age);
    }
    public static void main(String[] args) {
        Person p1 = new Person(1,"Nisarg");
        Person p2 = new Person(2,"Rutvik", 20);
        p1.display();
        p2.display();
    }
}