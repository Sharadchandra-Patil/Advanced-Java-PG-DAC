package tester;

import java.sql.*;
import static utils.DBUtils.fetchConnection;

public class TestStatement {

	public static void main(String[] args) {
		// esatblish DB connection
		try (Connection cn = fetchConnection();
				// create EMPTY statement object from Connection
				Statement st = cn.createStatement();
				// exec select query n get ResultSet object
				ResultSet rst = st.executeQuery("select * from my_emp");) {
			while (rst.next())
				// read n display row data
				System.out.printf("Emp Id %d Name %s Address %s Sal %.1f Dept %s Join Date %s %n", 
						rst.getInt(1),
						rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getString(5), rst.getDate(6));
		} //rst.close , st.close , cn.close
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
