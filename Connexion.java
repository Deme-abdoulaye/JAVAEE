package connect;

import java.sql.DriverManager;
import java.sql.Connection;
import com.mysql.jdbc.Driver;

public class Connexion{
	protected static Connection connection;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaee", "root","");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}
	
}
