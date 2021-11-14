package tester;

import java.sql.*;
import static utils.DBUtils.fetchConnection;

public class TestDBUtils {

	public static void main(String[] args) {
		try (Connection cn = fetchConnection()) {
//			Connection cn1 = fetchConnection();
//			Connection cn2 = fetchConnection();
			System.out.println("connected to db " + cn);
//			System.out.println("connected to db " + cn1);
//			System.out.println("connected to db " + cn2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
