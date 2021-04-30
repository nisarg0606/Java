package RahulSir;
import java.util.Scanner;
public class Student implements Comparable<Student>{
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
    @Override
    public String toString() {
        return rno + " " + name + " " + std;
    }

    @Override
    // public int compareTo(Student s) {
    //     if (std > s.std) {
    //         return 1;
    //     }else if(std < s.std){
    //         return -1;
    //     }
    //     else{
    //         return 0;
    //     }
    // }
    // @Override
	public int compareTo(Student s) 
	{
		return name.compareTo(s.name);
	}
    
}