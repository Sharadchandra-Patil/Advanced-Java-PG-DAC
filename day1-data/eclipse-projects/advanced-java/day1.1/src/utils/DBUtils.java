package utils;

import java.sql.*;

public class DBUtils {
	private static Connection cn;// null
	// add a static method to return SINGLETON (=single instance in the entire Java
	// App) to the caller

	public static Connection fetchConnection() throws SQLException{
		if (cn == null) {
			String url = "jdbc:mysql://localhost:3306/sunbeam21?useSSL=false&allowPublicKeyRetrieval=true";
			cn = DriverManager.getConnection(url, "root", "0214");
		}
		return cn;
	}
	//later will add a static method to close connection.

}
