package lieni.control.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataAccessModel {
	protected static Connection getConnection() {
		Connection connection = null;
		// Setting for my test server
		String dbUsername = "root";
		String dbPassword = "root";
		String url = "jdbc:mysql://localhost:3306/contact/root";
		
		try {
			// 
			Class.forName("org.mariadb.jdbc.Driver").newInstance();
			
			connection = DriverManager.getConnection(url, dbUsername,
					dbPassword);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return connection;
	} 
}

