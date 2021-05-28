package RahulSir.jdbcdemo;

import java.sql.*;

public class DbConnection1 {
	private static final String URLNAME = "jdbc:mysql://localhost:3309/student_data";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "nisarg";

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DRIVERCLASS);
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			if (conn != null) {
				// System.out.println("Db Connected : " + conn);
				// this line was just for checking connection with database
			} else
				System.out.println("Db not Connected : " + conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {
		DbConnection.getConnection();
	}
}