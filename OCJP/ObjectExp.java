package OCJP;

import java.util.Scanner;
public class ObjectExp{
    int rno;
    String name;
    int std;
    void scan()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rno: ");
        rno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter std: ");
        std = sc.nextInt();
        sc.close();
    }
    void display()
    {
        System.out.println(rno+" "+ name+" "+ std);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ObjectExp obj1 = new ObjectExp();
        obj1.scan();
        ObjectExp obj2 = new ObjectExp();
        obj2.scan();
        obj1.display();
        obj2.display();
        sc.close();
    }
}