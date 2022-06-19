package USA_Practice.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeBean {
    Scanner sc = new Scanner(System.in);
    private int empId;
    private String name;
    private float salary;
    private String positon;

    public EmployeeBean() {
    }

    public EmployeeBean(int empId, String name, float salary, String positon) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.positon = positon;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getPositon() {
        return positon;
    }

    public void setPositon(String positon) {
        this.positon = positon;
    }

    public void Scan() {
        System.out.print("Enter Empolyee id: ");
        empId = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Salary: ");
        salary = sc.nextFloat();
        System.out.print("Enter position: ");
        positon = sc.next();
    }

    public void update() {
        System.out.println("Enter your Name: ");
        name = sc.nextLine();
        System.out.println("Enter your Salary: ");
        salary = sc.nextFloat();
        System.out.println("Enter your Position: ");
        positon = sc.next();
    }

    public void display() {
        System.out.println("EmpID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Position: " + positon);
    }

    public int UseEmpID(ArrayList<EmployeeBean> a, int empId) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getEmpId() == empId) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Name: " + name + " EmpID: " + empId + " Salary: $" + salary + " Position: " + positon;
    }
}