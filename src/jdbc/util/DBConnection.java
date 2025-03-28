package jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
	// 1) Make Credentials
	private static String URLNAME = "jdbc:mysql://localhost:3306/gen_35_royal";
	private static String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static String USERNAME = "root";
	private static String PASSWORD = "root";

	// 2) create getConnection method
	public static Connection getConnection()
	{
		Connection conn = null;

		try
		{
			// 3) Load Driver class
			Class.forName(DRIVERCLASS);

			// 4) pass credentials into DriverManager's getConnection method
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);

		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}

		return conn;
	}

	public static void main(String[] args)
	{
		Connection conn = DBConnection.getConnection();

		// 5) validate connection object
		if (conn != null)
		{
			System.out.println("DB Connected : " + conn);
		} else
		{
			System.out.println("DB not Connected : " + conn);
		}
	}
}
