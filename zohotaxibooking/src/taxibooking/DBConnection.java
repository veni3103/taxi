package taxibooking;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	static Connection conn;
	public static Connection getConnection() throws Exception
	{
		if(conn==null) {
			conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/taxibooking?user=postgres&password=postgres");
			return conn;
		}
		else {
			return conn;
		}
	}
}