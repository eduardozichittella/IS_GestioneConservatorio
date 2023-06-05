package database;

import entity.EntityStudente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class StudenteDAO {
	
	/*
    DROP TABLE STUDENTE;
    CREATE TABLE STUDENTE (
    	Matricola INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
        Nome VARCHAR(255),
        Cognome VARCHAR(255),
        Username VARCHAR (10),
        Password VARCHAR (10),
        PIN VARCHAR (10));
  	 */ 
	
	public static void createStudenteTable() {
		Connection connection = DBManager.openConnection();
		try {
			Statement stmt = connection.createStatement();
			stmt.execute("CREATE TABLE IF NOT EXISTS STUDENTE (\n"
					+ "         Matricola INT NOT NULL AUTO_INCREMENT PRIMARY KEY, \n"
					+ "         Nome VARCHAR(255),\n"
					+ "         Cognome VARCHAR(255),\n"
					+ "         Username VARCHAR (10),"
					+ "         Password VARCHAR (10),"
					+ "         PIN VARCHAR (10));");
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
	
	public static void iscrizione(EntityStudente s) throws SQLException {
		Connection connection = DBManager.openConnection();
		
		String query = "INSERT INTO Studente (Matricola, Nome, Cognome, Username, Password, PIN) VALUES (?,?,?,?,?,?)";
		
		try (PreparedStatement stm = connection.prepareStatement(query)) {
			stm.setString(1, s.getMatricolaStud());
			stm.setString(2, s.getNomeStud());
			stm.setString(3, s.getCognomeStud());
			stm.setString(4, s.getUsernameStud());
			stm.setString(5, s.getPasswordStud());
			
			stm.close();
			DBManager.closeConnection();
		
		}catch (SQLException ex) {
			throw new SQLException();
		}
	}

}
