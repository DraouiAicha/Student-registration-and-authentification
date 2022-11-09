package contextDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;

public class UserDbUtil {
	private static Connection conn;
	private static String url="jdbc:mysql://localhost/tp1";
	static
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,"root","");
	
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Probl�me de pilote");
		}
		catch(SQLException e)
		{
			System.out.println("Probl�me de base de donn�e");
		}
	}
	
	public static Connection getCon()
	{
		return conn;
	}
}
