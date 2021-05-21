package RahulSir.jdbcdemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentsDao {
    public int insert(){
        String insertQuery = "INSERT INTO STUDENT(name,std,ss,maths,sci,total) VALUES ('Nisarg Shah','12',100,100,100,300)";
        Connection connection = null;
        connection = DbConnection.getConnection();
        Statement smt = null;
        int rowsAffected = 0;
        if(connection!=null){
            try {
                smt = connection.createStatement();
                rowsAffected = smt.executeUpdate(insertQuery);
            } catch (SQLException e) {
              e.printStackTrace();  
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Databse error.....");
        }
        return rowsAffected;
    }

    public static void main(String[] args) {
        StudentsDao s = new StudentsDao();
        int rowsAffected = s.insert();
        if(rowsAffected>0)
        {
            System.out.println(rowsAffected + " record successfully inserted.");
		} else 
		{
			System.out.println(rowsAffected + " record not inserted.");
		}
    }
}
