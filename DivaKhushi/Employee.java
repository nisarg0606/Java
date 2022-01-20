package DivaKhushi;

public class Employee {
    float salary = 40000;
}

class Programmer extends Employee{
    int bonus = 20000;
    public static void main(String[] args) {
        Programmer p = new Programmer();
        Employee e = new Employee();
        System.out.println(e.salary);
        System.out.println("Final Salary with bonus is: "+ (e.salary+p.bonus));
    }
}