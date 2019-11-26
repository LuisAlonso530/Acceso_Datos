package Conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	private static final String JDBC_URL="jdbc:mysql://halifaxtraining.es:3306/ciberkaosprof";
	private static Connection instance=null;
	
	private DBConnection() {
	}

	public static Connection getConnection() throws SQLException, ClassNotFoundException{

		try {
		Class.forName("com.mysql.jdbc.DRIVER");
		if (instance == null) {
			instance = (Connection) DriverManager.getConnection("jdbc.mysql://haifaxtraining.es:3306", "uss024", "halcon2019");
		} 
		}catch(SQLException e) {
			e.printStackTrace();
		}
			Properties props = new Properties();
			props.put("user", "uss024");
			props.put("password", "halcon2019");
			instance = DriverManager.getConnection(JDBC_URL, props);
		
		return instance;
	}
	
	

	

}
