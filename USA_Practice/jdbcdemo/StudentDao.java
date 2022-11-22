package USA_Practice.jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import USA_Practice.jdbcdemo.util.DbConnection;

public class StudentDao {
	public static ArrayList<StudentBean> getAllStudentsRecords() {
		ArrayList<StudentBean> list = new ArrayList<>();
		Connection conn = DbConnection.getConnection();
		// System.out.println(conn);
		// statement for executing any query in database
		Statement stmt = null;
		String selectQuery = "SELECT id, firstname, lastname FROM student";
		// for storing the output from the query executed
		ResultSet rs = null;
		StudentBean bean = null;
		if (conn != null) {
			try {
				// creating the query object from the conn with proper credentials provided
				stmt = conn.createStatement();
				rs = stmt.executeQuery(selectQuery);
				while (rs.next()) {
					bean = new StudentBean();
					bean.setId(rs.getInt(1));
					bean.setFirstName(rs.getString(2));
					bean.setLastName(rs.getString(3));
					list.add(bean);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public int insertStudent(StudentBean bean) {
		Connection conn = DbConnection.getConnection();
		Statement stmt = null;
		String insertQuery = "INSERT INTO student (firstname, lastname) Values ('" + bean.getFirstName() + "','"
				+ bean.getLastName() + "');";
		int rowsAffected = 0;
		if (conn != null) {
			try {
				stmt = conn.createStatement();
				rowsAffected = stmt.executeUpdate(insertQuery);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Database Error from Insert Method...");
		}
		return rowsAffected;
	}

	public int deleteStudent(StudentBean bean) {
		Connection conn = DbConnection.getConnection();
		Statement stmt = null;
		String insertQuery = "DELETE FROM student WHERE id = " + bean.getId() + ";";
		int rowsAffected = 0;
		if (conn != null) {
			try {
				stmt = conn.createStatement();
				rowsAffected = stmt.executeUpdate(insertQuery);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Database Error from Delete Method...");
		}
		return rowsAffected;
	}

	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		StudentBean bean = new StudentBean();
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		while (choice != 0) {
			System.out.println("1 --- Insert Student");
			System.out.println("2 --- Update Student");
			System.out.println("3 --- Delete Student");
			System.out.println("4 --- Get All Students");
			System.out.println("0 --- Exit");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Enter First Name: ");
					String firstName = sc.next();
					System.out.println("Enter Last Name: ");
					String lastName = sc.next();
					bean = new StudentBean(firstName, lastName);
					int result = dao.insertStudent(bean);
					if (result > 0) {
						System.out.println(result);
						System.out.println("Student inserted Successfully...");
					} else {
						System.out.println(result);
						System.out.println("Student data is not successfully written....");
					}
					break;
				case 2:
					break;
				case 3:
					System.out.println("Enter the id you want to delete: ");
					int id = sc.nextInt();
					bean.setId(id);
					result = dao.deleteStudent(bean);
					if (result > 0) {
						System.out.println(result);
						System.out.println("Student deleted Successfully...");
					} else {
						System.out.println(result);
						System.out.println("Student data is not successfully deleted....");
					}
					break;
				case 4:
					ArrayList<StudentBean> alldata = StudentDao.getAllStudentsRecords();
					System.out.println("|ID	| First Name	| Last Name		|");
					for (int i = 0; i < alldata.size(); i++) {
						// System.out.println("id: " + alldata.get(i).getId() + " Firstname: " +
						// alldata.get(i).getFirstName() +" Lastname: "+ alldata.get(i).getLastName());
						System.out.println(alldata.get(i));
					}
					break;
				case 0:
					System.out.println("Thank you for your visit...");
					System.exit(0);
				default:
					System.out.println("Enter a valid Choice...");
			}
		}
	}
}