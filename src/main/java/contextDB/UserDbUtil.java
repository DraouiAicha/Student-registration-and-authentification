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
			System.out.println("Problème de pilote");
		}
		catch(SQLException e)
		{
			System.out.println("Problème de base de donnée");
		}
	}
	
	public static Connection getCon()
	{
		return conn;
	}
}
