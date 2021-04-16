package OCJP;

import java.util.Scanner;
public class Employee{
    int empid;
    String name;
    float salary;
    String Des;
    void scan()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter empid: ");
        empid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter salary: ");
        salary = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter Des: ");
        Des = sc.nextLine();
        sc.close();
    }
    void display()
    {
        System.out.println(empid+" "+ name+" "+ salary+" "+ Des);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Employee obj1 = new Employee();
        obj1.scan();
        Employee obj2 = new Employee();
        obj2.scan();
        Employee obj3 = new Employee();
        obj3.scan();
        Employee obj4 = new Employee();
        obj4.scan();
        Employee obj5 = new Employee();
        obj5.scan();
        sc.close();
        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
        obj5.display();
    }
}