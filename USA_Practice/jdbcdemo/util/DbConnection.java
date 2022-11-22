package USA_Practice.jdbcdemo.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	// ready with credentials
	private static final String URLNAME = "jdbc:mysql://localhost:3306/demo";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String Password = "root";
	public static Connection getConnection()
	{
		Connection conn = null;
		try {
			// load driver class
			Class.forName(DRIVERCLASS);
			// create the connection
			conn = DriverManager.getConnection(URLNAME, USERNAME, Password);
			if(conn != null)
				System.out.println("DB Connected...");
			else
				System.out.println("DB Not Connected " + conn);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) {
		DbConnection.getConnection();
	}
}