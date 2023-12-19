package aarsh;

public class Student {
    int rollno;
    String name;
    Student(int id, String s)
    {
        rollno = id;
        name = s;
    }
    // employee --> id, name , designation 
    public static void main(String[] args) {
        Student s1 = new Student(1, "Aarsh");
        Student s2 = new Student(2, "Nisarg");

        System.out.println(s1.rollno + "  " + s1.name);
        System.out.println(s2.rollno + "  " + s2.name);
    }
}
