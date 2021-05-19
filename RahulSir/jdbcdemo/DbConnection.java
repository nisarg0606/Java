package RahulSir.jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.ResultSet;
import java.sql.SQLException;
public class DbConnection {
    // 1) ready with credential
	private static final String URLNAME     ="jdbc:mysql://localhost:3309/world";
	private static final String DRIVERCLASS ="com.mysql.cj.jdbc.Driver";
	private static final String USERNAME    ="root";
	private static final String PASSWORD	="nisarg";
	
	public static  void getConnection() 
	{
		Connection conn = null;
		try 
		{
			// 2) Load driver class
			Class.forName(DRIVERCLASS);
			// 3) pass creedential into DriverManager's getConnection Method
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			// 4) validate connection object
			if (conn!=null) 
			{
				System.out.println("Db Connected : " + conn);
			} else 
			System.out.println("Db not Connected : " + conn);
			// java.sql.Statement stmt = conn.createStatement();
			// ResultSet rs = stmt.executeQuery("Select Name from Country where population < 10000");
			// while (rs.next()) {
			// 	System.out.println(rs.getString(1));
			// }
			conn.close();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}	
	}
	public static void main(String[] args) 
	{
		DbConnection.getConnection();
	}
}
