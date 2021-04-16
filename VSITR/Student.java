package VSITR;

public class Student {
    int id,age;
    String name;
    Student(int i, String n){
        id=i;
        name=n;
    }
    Student(int i, String n, int a)
    {
        id=i;
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println("ID: "+id+"\nName: "+name);
    }
    public static void main(String[] args) {
        Student s1 = new Student(1,"Nisarg");
        Student s2 = new Student(2,"Rutvik", 20);
        s1.display();
        s2.display();
    }
}
