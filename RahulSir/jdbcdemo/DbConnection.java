package RahulSir.jdbcdemo;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
	// 1) ready with credential
	public static Connection getConnection() {
		FileInputStream fin = null;
		Properties prop = new Properties();
		try {
			fin = new FileInputStream("RahulSir\\jdbcdemo\\config.properties");
			prop.load(fin);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String urlname=prop.getProperty("URLNAME").trim();
		String driverclass=prop.getProperty("DRIVERCLASS").trim();
		String username=prop.getProperty("USERNAME").trim();
		String password=prop.getProperty("PASSWORD").trim();
		Connection conn = null;
		try {
			// 2) Load driver class
			Class.forName(driverclass);
			// 3) pass creedential into DriverManager's getConnection Method
			conn = DriverManager.getConnection(urlname, username, password);
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
