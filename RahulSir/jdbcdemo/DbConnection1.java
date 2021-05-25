package RahulSir.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnection1 {
	// 1) ready with credential
	private static final String URLNAME = "jdbc:mysql://localhost:3309/student_data";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "nisarg";

	public static Connection getConnection() {
		Connection conn = null;
		try {
			// 2) Load driver class
			Class.forName(DRIVERCLASS);
			// 3) pass creedential into DriverManager's getConnection Method
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			// 4) validate connection object
			if (conn != null) {
				// System.out.println("Db Connected : " + conn);
				//this line was just for checking connection with database
			} else
				System.out.println("Db not Connected : " + conn);
			// java.sql.Statement stmt = conn.createStatement();
			// ResultSet rs = stmt.executeQuery("Select Name from Country where population <
			// 10000");
			// while (rs.next()) {
			// System.out.println(rs.getString(1));
			// }
			// conn.close();
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
