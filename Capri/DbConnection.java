// package Capri;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;
// import org.verdictdb.commons.DBTablePrinter;
// // import org.brunocvcunha.instagram4j.Instagram4j;
// // import org.quartz.JobDetail;
// // import org.quartz.Scheduler;
// // import org.quartz.SchedulerFactory;
// // import org.quartz.Trigger;
// // import org.quartz.impl.StdSchedulerFactory;
// // import com.capri.BaseInit.BaseInit;
// // import com.capri.common.CommonMethods;
// public class DbConnection {
// 	public static void main(String[] args) throws Exception {
// 		Connection con;
// 		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
// 		String url = "jdbc:mysql://instagram.cizinglwfg1s.us-east-1.rds.amazonaws.com:3306/instagram2018";
// 		String user = "admin";
// 		String pass = "h3h2SUKPPw4U";
// 		try {
// 			con = DriverManager.getConnection(url, user, pass);
// 			System.out.println("Connection established: " + con);
// 			System.out.println("RDS Connected!!");
// 		}
// 		catch (SQLException e1) {
// 			e1.printStackTrace();
// 			con = null;
// 			System.out.println("DB not Connected");
// 		}
// 		System.out.println("\n");
// 		Statement stmt = con.createStatement();
// 		ResultSet rs = stmt.executeQuery("SELECT * FROM ig_customers LIMIT 15");
// 		DBTablePrinter.printResultSet(rs);
// 	}
// }