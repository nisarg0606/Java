package VSITR;
import java.util.Scanner;
public class Employye_wage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base pay: ");
        double base = sc.nextDouble();
        System.out.print("Enter working hours per week: ");
        double hour = sc.nextDouble();
        double salary;
        if(base < 150 && hour > 60)
        {
            System.out.println("Enter base pay greater than 150 and hours less than 60");
        }
        else if (base < 150) {
            System.out.println("Enter base pay greater than 150...");
        }
        else if (hour > 60) {
            System.out.println("Enter valid hours...");
        }
        else{
            if(hour<=40)
            {
                salary = 40 * base;
            }
            else{
                salary = 40 * base;
                salary = salary +((hour-40)*(base*1.5));
            }
            System.out.println("Salary to be paid per week is Rs. "+salary);
        }
        sc.close();
    }
}
