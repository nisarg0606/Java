package RahulSir.jdbcdemo;

import java.util.*;
import java.sql.*;

public class StudentDaoPreparedStatement {
    public int insert(StudentBean studentBean) {
        String insertQuery = "INSERT INTO student(name,std,ss,maths,science,total) VALUES(?,?,?,?,?,?)";
        Connection connection = null;
        connection = DbConnection.getConnection();
        int rowsAffected = 0;
        if (connection != null) {
            try {
                PreparedStatement pstmt = connection.prepareStatement(insertQuery);
                pstmt.setString(1, studentBean.getName());
                pstmt.setString(2, studentBean.getStd());
                pstmt.setFloat(3, studentBean.getSS());
                pstmt.setFloat(4, studentBean.getMaths());
                pstmt.setFloat(5, studentBean.getScience());
                pstmt.setFloat(6, studentBean.getTotal());
                rowsAffected = pstmt.executeUpdate();
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

    public int update(StudentBean sbean, int updateRno) {
        String updateQuery = "UPDATE student SET name=?,std=?,ss=?,maths=?,science=?,total=? WHERE rno =?";
        Connection connection = null;
        connection = DbConnection.getConnection();
        int rowsAffected = 0;
        if (connection != null) {
            try {
                PreparedStatement psmt = connection.prepareStatement(updateQuery);
                psmt.setString(1, sbean.getName());
                psmt.setString(2, sbean.getStd());
                psmt.setFloat(3, sbean.getSS());
                psmt.setFloat(4, sbean.getMaths());
                psmt.setFloat(5, sbean.getScience());
                psmt.setFloat(6, sbean.getTotal());
                psmt.setInt(7, updateRno);
                rowsAffected = psmt.executeUpdate();
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
        PreparedStatement pstmt = null;
        Connection conn = DbConnection.getConnection();
        int rowsEffected = 0;
        String deleteQuery = "DELETE FROM student WHERE rno =?";

        if (conn != null) {
            try {
                pstmt = conn.prepareStatement(deleteQuery);
                pstmt.setInt(1, rno);
                rowsEffected = pstmt.executeUpdate();

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
            System.out.println("StudentDaoPreparedStatement - select() ---> Db not connected : " + conn);
        }
        return list;
    }

    public static ArrayList<StudentBean> getStudentsrecord(int rno) {
        ArrayList<StudentBean> list = new ArrayList<StudentBean>();
        Connection conn = DbConnection.getConnection();
        Statement stmt = null;
        String selectQuery = "SELECT rno,name,std,ss,maths,science,total FROM student where rno = " + rno;
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
            System.out.println("StudentDaoPreparedStatement - select() ---> Db not connected : " + conn);
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
            System.out.println("5 --- Display record by rno");
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
                    StudentDaoPreparedStatement s = new StudentDaoPreparedStatement();
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
                    s = new StudentDaoPreparedStatement();
                    sb = new StudentBean(name, std, sS, maths, science, total);
                    rowsAffected = s.update(sb, updateRno);
                    if (rowsAffected > 0)
                        System.out.println("1 Row updated Successfully");
                    else
                        System.out.println("Row is not updated");
                    break;
                case 3:
                    System.out.print("Enter which Rno you want to delete: ");
                    s = new StudentDaoPreparedStatement();
                    int rno = sc.nextInt();
                    rowsAffected = s.delete(rno);
                    if (rowsAffected > 0) {
                        System.out.println(rowsAffected + " record successfully Deleted.");
                    } else {
                        System.out.println(rowsAffected + " record not Deleted.");
                    }
                    break;
                case 4:
                    s = new StudentDaoPreparedStatement();
                    ArrayList<StudentBean> list = StudentDaoPreparedStatement.getAllStudentsrecords();
                    StudentBean sbean = null;
                    for (int i = 0; i < list.size(); i++) {
                        sbean = list.get(i);
                        System.out.println(sbean);
                    }
                    if (list.size() == 0) {
                        System.out.println("The Database is empty.... Please insert some data to view the results");
                    }
                    break;
                case 5:
                    System.out.println("Enter the rollno you want data of: ");
                    rno = sc.nextInt();
                    s = new StudentDaoPreparedStatement();
                    list = StudentDaoPreparedStatement.getStudentsrecord(rno);
                    sbean = null;
                    for (int i = 0; i < list.size(); i++) {
                        sbean = list.get(i);
                        System.out.println(sbean);
                    }
                    if (list.size() == 0) {
                        System.out.println("The Database is empty.... Please insert some data to view the results");
                    }
                    break;
                case 0:
                    System.out.println("Thank you for visiting... See you back soon....");
                    break;
                default:
                    System.out.println("Please enter a valid choice.....");
                    break;
            }
        }
        sc.close();
    }
}