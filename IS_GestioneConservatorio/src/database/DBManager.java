package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	
	protected final static String dbPath = "./test";
	protected final static String URL = "jdbc:h2:tcp://localhost/" + dbPath;
	
	protected static Connection conn;
	
	public static Connection openConnection(){
		if (conn == null){
			try {
				conn  = DriverManager.getConnection( URL , "sa", "");
			} catch (SQLException e) {
				System.out.printf("Connessione al database non riuscita!");
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public static void closeConnection() throws SQLException{
		if (conn != null){
			conn.close();
			conn = null;
		}

	}
	
}
