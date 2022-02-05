package adsfas;

import java.sql.*;

public class Sample {
	public static void main(String args[]) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://testing.c76bjabsoj10.us-east-2.rds.amazonaws.com:3306", "admin", "admin123");
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from sys.sys_config");
			while (rs.next())
				System.out.println( rs.getString(1) + "  " + rs.getString(2));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
