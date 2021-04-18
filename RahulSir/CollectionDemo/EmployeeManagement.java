/*
    Author: Nisarg Shah
    Topic: Emoloyee Management System
    DOE: 18-04-2021
*/ 
package RahulSir.CollectionDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<Employee>();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee Database Management System");
        while (choice != 6) {
            System.out.println("1) For Insert           ");
            System.out.println("2) FOR Update           ");
            System.out.println("3) FOR Delete           ");
            System.out.println("4) Display All records  ");
            System.out.println("5) Searching by Name	");
            System.out.println("6) Exit	");

            choice = sc.nextInt();

            switch (choice) {
            case 1:
                Employee e = new Employee();
                e.scan();
                l.add(e);
                System.out.println("Employee Record inserted Successfully...");
                break;
            case 2:
                System.out.println("Enter which Employee Id you want to update: ");
                int updateId = sc.nextInt();
                int i = 0;
                for (; i < l.size(); i++) {
                    if (l.get(i).getEid() == updateId)
                        break;
                }
                Employee Updateobj = l.get(i);
                Updateobj.update();
                l.set(i, Updateobj);
                System.out.println("Employee Details updated Successfully...");
                break;
            case 3:
                System.out.println("Enter which ID you want to delete: ");
                int delId = sc.nextInt();
                for (i = 0; i < l.size(); i++) {
                    if (l.get(i).getEid() == delId) {
                        break;
                    }
                    l.remove(i);
                    System.out.println("Employee record deleted Successfully...");
                    System.out.println();
                }
            case 4:
                System.out.println();
                for (i = 0; i < l.size(); i++) {
                    Employee employee = l.get(i);
                    System.out.println("Employee ID: " + employee.getEid() + "\nEmployee Name: " + employee.getEname()
                            + "\nEmployee Salary: " + employee.getSalary());
                }
                System.out.println();
                break;
            case 5:
                System.out.print("Enter the name you want to search for: ");
                String sname = sc.next();
                for (i = 0; i < l.size(); i++) {
                    if (sname.contentEquals(l.get(i).getEname())) {
                        Employee edisp = l.get(i);
                        System.out.println("Rno: " + edisp.getEid() + "\nName: " + edisp.getEname() + "\nSalary: "
                                + edisp.getSalary() + "\n");
                        break;
                    } else if (sname.contentEquals(l.get(i).getEname().toLowerCase())) {
                        Employee sdisp = l.get(i);
                        System.out.println("Rno: " + sdisp.getEid() + "\nName: " + sdisp.getEname() + "\nStd: "
                                + sdisp.getSalary() + "\n");
                        break;
                    }
                    System.out.println("Please enter a valid name....");
                }
                break;

            case 6:
                System.out.println("Exiting....");
                System.exit(0);
                break;
            default:
                System.out.println("Please enter a valid number");
                break;
            }
        }
        sc.close();
    }
}