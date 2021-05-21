package RahulSir.jdbcdemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDaoDynamic {
    public int insert(StudentBean studentBean) {
        String insertQuery = "INSERT INTO student(name,std,ss,maths,sci,total) VALUES('" + studentBean.getName() + "','"
                + studentBean.getStd() + "'," + studentBean.getSS() + "," + studentBean.getMaths() + ","
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        sc.close();
    }
}