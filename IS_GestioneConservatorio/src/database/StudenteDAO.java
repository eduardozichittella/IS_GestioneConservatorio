package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StudenteDAO {
	
	/*
    DROP TABLE STUDENTE;
    CREATE TABLE STUDENTE (
    	Matricola INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
        Nome VARCHAR(255),
        Cognome VARCHAR(7),
        Username VARCHAR (10),
        Password VARCHAR (10),
        PIN INT);
  	 */ 
	
	public static void createStudenteTable() {
		Connection connection = DBManager.openConnection();
		try {
			Statement stmt = connection.createStatement();
			stmt.execute("CREATE TABLE IF NOT EXISTS STUDENTE (\n"
					+ "         Matricola INT NOT NULL AUTO_INCREMENT PRIMARY KEY, \n"
					+ "         Nome VARCHAR(255),\n"
					+ "         Cognome VARCHAR(7),\n"
					+ "         Username VARCHAR (10),"
					+ "         Password VARCHAR (10),"
					+ "         PIN INT);");
			stmt.close();
			DBManager.closeConnection();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void dropStudenteTable() {
		Connection connection = DBManager.openConnection();
		try {
			Statement stmt = connection.createStatement();
			stmt.execute("DROP TABLE STUDENTE");
			stmt.close();
			DBManager.closeConnection();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
