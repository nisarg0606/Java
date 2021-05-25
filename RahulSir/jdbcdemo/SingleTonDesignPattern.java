package RahulSir.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingleTonDesignPattern {
	private static final String URLNAME = "jdbc:mysql://localhost:3309/student_data";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "nisarg";
	private static Connection conn = null;

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DRIVERCLASS);
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			if (conn != null) {
			} else
				System.out.println("Db not Connected : " + conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
    public static Connection getDbinstance() {
        if(conn == null)
            conn = getConnection();
        return conn;
    }
	public static void main(String[] args) {
        Connection conn0 = SingleTonDesignPattern.getDbinstance();
        Connection conn1 = SingleTonDesignPattern.getDbinstance();
        Connection conn2 = SingleTonDesignPattern.getDbinstance();
        Connection conn3 = SingleTonDesignPattern.getDbinstance();

        System.out.println(conn0);
        System.out.println(conn1);
        System.out.println(conn2);
        System.out.println(conn3);
    }
}