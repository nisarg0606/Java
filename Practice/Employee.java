package Practice;
import java.util.Scanner;
public class Employee {
    private String name;
    private int year;
    private double salary;

    Scanner sc = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getSalary() {
        return salary;
    }

    Employee() {
        name = "";
        year = 0;
        salary = 0;
        System.out.println("This is the default constructor");
    }

    Employee(String name, int year, double salary) {
        this.name = name;
        this.salary = salary;
        this.year = year;
    }

    void raisesalary() {
        double annual_salary = salary * 12;
        annual_salary = annual_salary + (annual_salary * 0.1);
        System.out.println("The new Salary after 10% increment at the end of the year is : " + annual_salary);
    }

    double inputsalary() {
        System.out.print("Enter your salary: ");
        salary = sc.nextDouble();
        if (salary < 0) {
            System.out.println("Please enter a valid salary....");
            inputsalary();
        }
        return salary;
    }
//how many months in 1 year ? -> 12 months in 1 year 30000/month -> 30000*12 = 360000 + (360000*0.1) = 396000
    int inputyear() {
        System.out.print("Enter the year joined: ");
        year = sc.nextInt();
        if (year < 1950 || year > 2021) {
            System.out.println("Please enter a valid year...");
            inputyear();
        }
        return year;
    }

    String inputname() {
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        return name;
    }

    void display() {
        System.out.println("The name of the employee is: " + name);
        System.out.println("The no  of years the employee is: " + (2022 - year));
        System.out.println("The salary of the employee is: " + salary);
    }

    // int noofyearsworked() {
    //     int no = 2022 - year;
    //     return no;
    // }

    public static void main(String[] args) {
        Employee e = new Employee();
        Employee econ = new Employee(e.inputname(), e.inputyear(), e.inputsalary());
        econ.raisesalary();
        // econ.noofyearsworked();
        econ.display();
    }
}