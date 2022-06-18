package USA_Practice.Collection;

import java.util.Scanner;

public class StudentBean {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int age;
    private int rollNo;

    // default constuctor
    StudentBean() {

    }

    StudentBean(String name, int age, int rollNo) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void Scan() {
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        System.out.println("Enter your rollno: ");
        rollNo = sc.nextInt();
    }
    public void update()
    {
        System.out.println("Enter yout Name: ");
        name = sc.next();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
    }
    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll no: " + rollNo);
        System.out.println("Age: " + age);
    }
}