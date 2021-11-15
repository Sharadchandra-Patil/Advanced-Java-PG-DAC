package tester;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) {
		try {
			// testing DB connection
			// load Type IV JDBC Driver in JVM's meta space(method area)
	//		Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/sunbeam21?useSSL=false&allowPublicKeyRetrieval=true";
			//establish DB connection
			try(Connection cn=DriverManager.getConnection(url, "root", "0214"))
			{
				System.out.println("connected to DB "+cn);
			}//cn.close() : releasing DB conn.
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
