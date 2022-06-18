package USA_Practice.Collection;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<StudentBean> list = new ArrayList<>();
        StudentBean s1 = new StudentBean("Reyaansh", 12, 1);
        list.add(s1);
        StudentBean s2 = new StudentBean("Soham", 15, 2);
        list.add(s2);
        StudentBean s3 = new StudentBean("Nidish", 15, 3);
        list.add(s3);
        StudentBean s4 = new StudentBean("Milan", 19, 4);
        list.add(s4);
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
            System.out.println("1 For inserting Student");
            System.out.println("2 For updating a Student");
            System.out.println("3 For deleting a Student");
            System.out.println("4 For view all Students");
            System.out.println("5 For view a student by rollno");
            System.out.println("6 For Exit.....");
            choice = sc.nextInt();
            int i = 0;
            switch (choice) {
                case 1:
                    StudentBean studentBean = new StudentBean();
                    studentBean.Scan();
                    list.add(studentBean);
                    break;
                case 2:
                    int updateRollNo = sc.nextInt();
                    i = 0;
                    for (; i < list.size(); i++) {
                        if (list.get(i).getRollNo() == updateRollNo) {
                            System.out.println("Enter New Name: ");
                            String name = sc.next();
                            list.get(i).SetName(name);
                            System.out.println("Enter New Age: ");
                            int age = sc.nextInt();
                            list.get(i).setAge(age);
                            System.out.println("Record Updated Successfully....");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Please enter the roll no you want to delete: ");
                    int delRollNo = sc.nextInt();
                    i = 0;
                    for(; i < list.size(); i++)
                    {
                        if(list.get(i).getRollNo() == delRollNo)
                        {
                            list.remove(i);
                            System.out.println("Roll no deleted Successfully....");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.println("List of all students.....");
                    if (list.size() == 0) {
                        System.out.println("List is empty...");
                    } else {

                        for (StudentBean s : list) {
                            System.out.println("Name: " + s.getName() + " Roll No: " + s.getRollNo() + " Age: "
                                    + s.getAge() + "\n");
                        }
                    }
                    break;
                case 5:
                    System.out.println();
                    int rollNo = sc.nextInt();
                    i = 0;
                    for (; i < list.size(); i++) {
                        if (list.get(i).getRollNo() == rollNo) {
                            System.out.println("Name: " + list.get(i).getName() + " Roll No: " + list.get(i).getRollNo()
                                    + " Age: " + list.get(i).getAge() + "\n");
                            break;
                        } else {
                            System.out.println("No records Found.....\n");
                        }
                    }
                case 6:
                    System.out.println("Thank you for Visiting....");
                    break;
                default:
                    System.out.println("Please enter the valid number....");
                    break;
            }
        }
    }
}