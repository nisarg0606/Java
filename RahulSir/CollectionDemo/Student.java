package RahulSir.CollectionDemo;
import java.util.Scanner;
public class Student {
    private int rno;
    private String name;
    private int std;
    Scanner sc = new Scanner(System.in);
    public Student() {
    }

    public Student(int rno, String name, int std) {
        this.rno = rno;
        this.name = name;
        this.std = std;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getstd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    public void scan() 
	{
		System.out.print("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name : ");
		name = sc.nextLine();
		System.out.print("Enter Std : ");
		std = sc.nextInt();
	}
	public void update() 
	{
        sc.nextLine();
		System.out.print("Enter Name : ");
		name = sc.nextLine();
		System.out.print("Enter Std : ");
		std = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(rno + " " + name + " " + std);
	}
}