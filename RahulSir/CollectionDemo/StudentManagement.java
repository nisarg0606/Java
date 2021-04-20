/*
    Author: Nisarg Shah
    Topic: Student Management Program
    DOC: 17-04-2021
*/
package RahulSir.CollectionDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
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
                Student s = new Student();
                s.scan();
                list.add(s);
                System.out.println("Student record successfully inserted");
                break;
            case 2:
                System.out.println("Enter Rno which you want to update - ");
                int updateRno = sc.nextInt();
                int i = 0;
                for (; i < list.size(); i++) {
                    if (list.get(i).getRno() == updateRno) {
                        break;
                    }
                }
                Student updateObj = list.get(i);
                updateObj.update();
                list.set(i, updateObj);
                System.out.println("Student record successfully updated");
                break;
            case 3:
                System.out.println("Enter which number you want to delete: ");
                int delrno = sc.nextInt();
                // i =0;
                for (i = 0; i < list.size(); i++) {
                    if (list.get(i).getRno() == delrno) {
                        break;
                    }
                }
                list.remove(i);
                System.out.println("Student record deleted...");
                System.out.println();
                break;

            case 4:
                System.out.println();
                for (i = 0; i < list.size(); i++) {
                    Student sdisp = list.get(i);
                    System.out.println(
                            "Roll no: " + sdisp.getRno() + "\nName: " + sdisp.getName() + "\nStd: " + sdisp.getstd());
                }
                System.out.println();
                break;
            case 5:
                System.out.print("Enter the name you want to search for: ");
                sc.nextLine();
                String sname = sc.nextLine();
                boolean flag = false;
                i = 0;
                for (; i < list.size(); i++) {
                    if(sname.equalsIgnoreCase(list.get(i).getName()))
                    {
                        flag= true;
                        break;
                    }
                }
                if(flag)
                {
                    System.out.println("The name you searched for is found successfully...");
                    s = list.get(i);
                    System.out.println("Roll no: "+s.getRno() +" Name: "+s.getName()+" Std: "+ s.getstd());
                }
                else
                {
                    System.out.println("Student record not found...");
                }
                break;
            case 6:
                System.out.println("Thank you for visiting.... visit again");
                System.exit(0);
                break;

            default:
                System.out.println("Please enter a valid number...");
                break;
            }
        }
        sc.close();
    }
}
