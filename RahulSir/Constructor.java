package RahulSir;

import java.util.Scanner;

public class Constructor {
    int rno;
    String name;
    int std;

    public Constructor() {
        System.out.println("Start :: Default Constructor");
        rno = 7;
        name = "Japan";
        std = 12;
        System.out.println("Exit :: Default Constructor");
    }

    public Constructor(Constructor s) {
        System.out.println("Start :: Copy Constructor");
        this.rno = s.rno;
        this.name = s.name;
        this.std = s.std;
        System.out.println("Exit :: Copy Constructor");
    }

    public Constructor(int rno, String name, int std) {
        System.out.println("Start :: Para Constructor");
        this.rno = rno;
        this.name = name;
        this.std = std;
        System.out.println("Exit :: Para Constructor");
    }

    void scan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rno : ");
        rno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter Std : ");
        std = sc.nextInt();
        sc.close();
    }

    public void disp() {
        System.out.println(rno + " " + name + " " + std);
    }
    public static void main(String[] args) {
        System.out.println("Start :: Main Method");
        Scanner sc = new Scanner(System.in);
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor(15, "Nisarg", 12);
        obj1.disp();
        obj2.disp();

        Constructor obj3 = new Constructor(obj2);
        obj3.disp();
        sc.close();
        System.out.println("Exit :: Main Method");
    }
}