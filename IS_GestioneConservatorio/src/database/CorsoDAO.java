package database;

import entity.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CorsoDAO {

	/*
    DROP TABLE CORSO;
    CREATE TABLE CORSO (
    	Codice INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
        Denominazione VARCHAR(255),
        CFU VARCHAR(255));
  	 */
	
	public static void createCorsoTable() {
		Connection connection = DBManager.openConnection();
		
		try {
			Statement stmt = connection.createStatement();
			stmt.execute("CREATE TABLE IF NOT EXISTS CORSO (\n"
					+ "         Codice INT NOT NULL AUTO_INCREMENT PRIMARY KEY, \n"
					+ "         Denominazione VARCHAR(255),\n"
					+ "         CFU VARCHAR(255),\n");
			stmt.close();
			DBManager.closeConnection();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void dropCorsoTable() {
		Connection connection = DBManager.openConnection();
		try {
			Statement stmt = connection.createStatement();
			stmt.execute("DROP TABLE CORSO");
			stmt.close();
			DBManager.closeConnection();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void creazioneCorso(EntityCorso c) throws SQLException {
		Connection connection = DBManager.openConnection();
		
		String query = "INSERT INTO Corso (Codice, Denominazione, CFU) VALUES (?,?,?)";
		
		try (PreparedStatement stm = connection.prepareStatement(query)) {
			stm.setString(1, c.getCodice());
			stm.setString(2, c.getDenominazione());
			stm.setInt(3, c.getCrediti());
		
			stm.close();
			DBManager.closeConnection();
		
		}catch (SQLException ex) {
			throw new SQLException();
		}
	}
}
