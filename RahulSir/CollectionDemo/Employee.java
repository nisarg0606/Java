package RahulSir.CollectionDemo;
import java.util.Scanner;
public class Employee {
    private String Ename;
    private int Eid;
    private float Salary;
    Scanner sc = new Scanner(System.in);
    public Employee() {
        
    }
    public Employee(int Eid, String Ename, float Salary){
        this.Eid = Eid;
        this.Ename= Ename;
        this.Salary = Salary;
    }
    
    public int getEid() {
        return Eid;
    }

    public void setEid(int Eid){
        this.Eid = Eid;
    }

    public String getEname(){
        return Ename;
    }

    public void setEname(String Ename){
        this.Ename = Ename;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }

    public void scan() 
	{
		System.out.print("Enter Employee id : ");
		Eid = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee Name : ");
		Ename = sc.nextLine();
		System.out.print("Enter Employee Salary : ");
		Salary = sc.nextInt();
	}

    public void update() {
        sc.nextLine();
        System.out.print("Enter Employee Name : ");
		Ename = sc.nextLine();
		System.out.print("Enter Employee Salary : ");
		Salary = sc.nextInt();
    }

    public void display()
    {
        System.out.println("Employee id: "+Eid+"\nEmployee Name: "+Ename+"\nEmployee Salary: "+Salary);
    }
}