package RahulSir.jdbcdemo;

import java.sql.*;
import java.util.*;

public class StudentDaoDynamic {
    public int insert(StudentBean studentBean) {
        String insertQuery = "INSERT INTO student(name,std,ss,maths,science,total) VALUES('" + studentBean.getName()
                + "','" + studentBean.getStd() + "'," + studentBean.getSS() + "," + studentBean.getMaths() + ","
                + studentBean.getScience() + "," + studentBean.getTotal() + ")";
        Connection connection = null;
        connection = DbConnection.getConnection();
        Statement smt = null;
        int rowsAffected = 0;
        if (connection != null) {
            try {
                smt = connection.createStatement();
                rowsAffected = smt.executeUpdate(insertQuery);
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Databse error.....");
        }
        return rowsAffected;
    }

    public int update(StudentBean sbean, int updateRno) {
        String updateQuery = "UPDATE student SET name='" + sbean.getName() + "',std='" + sbean.getStd() + "',ss="
                + sbean.getSS() + ",maths=" + sbean.getMaths() + ",science=" + sbean.getScience() + ",total="
                + sbean.getTotal() + " WHERE rno = " + updateRno;
        Connection connection = null;
        connection = DbConnection.getConnection();
        Statement smt = null;
        int rowsAffected = 0;
        if (connection != null) {
            try {
                smt = connection.createStatement();
                rowsAffected = smt.executeUpdate(updateQuery);
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Database error.....");
        }
        return rowsAffected;
    }

    public int delete(int rno) {
        Statement stmt = null;
        Connection conn = DbConnection.getConnection();
        int rowsEffected = 0;
        String deleteQuery = "DELETE FROM student WHERE rno = " + rno;

        if (conn != null) {
            try {
                stmt = conn.createStatement();

                rowsEffected = stmt.executeUpdate(deleteQuery);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("StudentDao - delete() ---> Db not connected : " + conn);
        }
        return rowsEffected;
    }

    public static ArrayList<StudentBean> getAllStudentsrecords() {
        ArrayList<StudentBean> list = new ArrayList<StudentBean>();
        Connection conn = DbConnection.getConnection();
        Statement stmt = null;
        String selectQuery = "SELECT rno,name,std,ss,maths,science,total FROM student";
        ResultSet rs = null;
        StudentBean sbean = null;
        if (conn != null) {
            try {
                stmt = conn.createStatement();
                rs = stmt.executeQuery(selectQuery);
                while (rs.next()) {
                    sbean = new StudentBean();
                    sbean.setRno(rs.getInt(1));
                    sbean.setName(rs.getString(2));
                    sbean.setStd(rs.getString(3));
                    sbean.setSS(rs.getFloat(4));
                    sbean.setMaths(rs.getFloat(5));
                    sbean.setScience(rs.getFloat(6));
                    sbean.setTotal(rs.getFloat(7));
                    list.add(sbean);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("StudentDao - select() ---> Db not connected : " + conn);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            System.out.println("1 --- Insert");
            System.out.println("2 --- Update");
            System.out.println("3 --- Delete");
            System.out.println("4 --- Display all records");
            System.out.println("0 --- Exit");
            System.out.print("Enter what you want to perform: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter your std: ");
                    String std = sc.nextLine();
                    System.out.print("Enter your SS marks: ");
                    float sS = sc.nextFloat();
                    System.out.print("Enter your Maths marks: ");
                    float maths = sc.nextFloat();
                    System.out.print("Enter your Science marks: ");
                    float science = sc.nextFloat();
                    float total = (sS + maths + science);
                    StudentDaoDynamic s = new StudentDaoDynamic();
                    StudentBean sb = new StudentBean(name, std, sS, maths, science, total);
                    int rowsAffected = s.insert(sb);
                    if (rowsAffected > 0)
                        System.out.println("1 Row inserted Successfully");
                    else
                        System.out.println("Row is not inserted");
                    break;
                case 2:
                    System.out.print("Enter the rollno you want to update: ");
                    int updateRno = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Std: ");
                    std = sc.nextLine();
                    System.out.print("Enter SS marks: ");
                    sS = sc.nextFloat();
                    System.out.print("Enter Maths marks: ");
                    maths = sc.nextFloat();
                    System.out.print("Enter Science marks: ");
                    science = sc.nextFloat();
                    total = (sS + maths + science);
                    s = new StudentDaoDynamic();
                    sb = new StudentBean(name, std, sS, maths, science, total);
                    rowsAffected = s.update(sb, updateRno);
                    if (rowsAffected > 0)
                        System.out.println("1 Row updated Successfully");
                    else
                        System.out.println("Row is not updated");
                    break;
                case 3:
                    System.out.print("Enter which Rno you want to delete: ");
                    s = new StudentDaoDynamic();
                    int rno = sc.nextInt();
                    rowsAffected = s.delete(rno);
                    if (rowsAffected > 0) {
                        System.out.println(rowsAffected + " record successfully Deleted.");
                    } else {
                        System.out.println(rowsAffected + " record not Deleted.");
                    }
                    break;
                case 4:
                    s = new StudentDaoDynamic();
                    ArrayList<StudentBean> list = StudentDaoDynamic.getAllStudentsrecords();
                    StudentBean sbean = null;
                    for (int i = 0; i < list.size(); i++) {
                        sbean = list.get(i);
                        System.out.println(sbean);
                    }
                    if (list.size() == 0) {
                        System.out.println("The Databse is empty.... Please insert some data to view the results");
                    }
                    break;
                case 0:
                    System.out.println("Thank you for visiting... See you back soon....");
                    break;
                default:
                    System.out.println("Please enter a valid choice....");
                    break;
            }
        }
        sc.close();
    }
}