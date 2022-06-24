package USA_Practice.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<EmployeeBean> arrayList = new ArrayList<>();
        EmployeeBean e1 = new EmployeeBean(1, "Reyaansh", 5000, "CEO");
        EmployeeBean e2 = new EmployeeBean(2, "Nidish", 5500, "SWE");
        EmployeeBean e3 = new EmployeeBean(3, "Soham", 5300, "SD2");
        EmployeeBean e4 = new EmployeeBean(4, "Milan", 5600, "Sales");
        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);
        arrayList.add(e4);
        int choice = 0, i = 0;
        while (choice != 7) {
            System.out.println("1 --- Insert");
            System.out.println("2 --- Update");
            System.out.println("3 --- Delete");
            System.out.println("4 --- getAllEmployees");
            System.out.println("5 --- getEmployeeById");
            System.out.println("6 --- getEmployeeByPosition");
            System.out.println("7 --- Exit");
            choice = sc.nextInt();
            EmployeeBean employeeBean = new EmployeeBean();
            switch (choice) {
                // inserting an employee
                case 1:
                    employeeBean.Scan();
                    arrayList.add(employeeBean);
                    break;
                // update an employee
                case 2:
                    System.out.println("Enter empid you want to update: ");
                    int empId = sc.nextInt();
                    // i = 0;
                    // for (; i < arrayList.size(); i++) {
                    //     if (empId == arrayList.get(i).getEmpId()) {
                    //         break;
                    //     }
                    // }
                    i = employeeBean.UseEmpID(arrayList, empId);
                    // get the data from the i th index and store it in employeeBean
                    employeeBean = arrayList.get(i);
                    // you need to call the employeeBean.update method which will update things for
                    // us
                    employeeBean.update();
                    arrayList.set(i, employeeBean);
                    System.out.println("Employee Updated Successfully");
                    employeeBean.display();
                    break;
                // Delete Employee By Employee id
                case 3:
                    System.out.println("Enter empid you want to delete: ");
                    empId = sc.nextInt();
                    i = 0;
                    for (; i < arrayList.size(); i++) {
                        if (empId == arrayList.get(i).getEmpId()) {
                            break;
                        }
                    }
                    arrayList.remove(i);
                    System.out.println("Employee Deleted Successfully....");
                    break;
                // Get All Employees
                case 4:
                    for (EmployeeBean display : arrayList) {
                        System.out.println(display);
                    }
                    break;
                // Get Employee By ID
                case 5:
                    System.out.println("Enter empid you want to Get: ");
                    empId = sc.nextInt();
                    i = 0;
                    for (; i < arrayList.size(); i++) {
                        if (empId == arrayList.get(i).getEmpId()) {
                            break;
                        }
                    }
                    employeeBean = arrayList.get(i);
                    System.out.println(employeeBean);
                    break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("Thanks for Visiting....");
                    break;
                default:
                    System.out.println("Please Enter a valid number...");
            }
        }

    }
}

// Product id
// product name
// product category --> Add Category --> if category not present in the list then
// program need to print category doesn't exist and you need to ask to add that category
// product Price
// delete product
// update product
// show product by id or name
// show all products

// get all categories
// delete category
// update category