package database;

import entity.EntityDocente;
import entity.EntityStudente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DocenteDAO {
	
	/*
    DROP TABLE DOCENTE;
    CREATE TABLE DOCENTE (
    	Matricola INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
        Nome VARCHAR(255),
        Cognome VARCHAR(255));
  	 */
	
	public static void createDocenteTable() {
		Connection connection = DBManager.openConnection();
		try {
			Statement stmt = connection.createStatement();
			stmt.execute("CREATE TABLE IF NOT EXISTS DOCENTE (\n"
					+ "         Matricola INT NOT NULL AUTO_INCREMENT PRIMARY KEY, \n"
					+ "         Nome VARCHAR(255),\n"
					+ "         Cognome VARCHAR(255),\n");
			stmt.close();
			DBManager.closeConnection();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void dropDocenteTable() {
		Connection connection = DBManager.openConnection();
		try {
			Statement stmt = connection.createStatement();
			stmt.execute("DROP TABLE DOCENTE");
			stmt.close();
			DBManager.closeConnection();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void iscrizioneDocente(EntityDocente d) throws SQLException {
		Connection connection = DBManager.openConnection();
		
		String query = "INSERT INTO Docente (Matricola, Nome, Cognome) VALUES (?,?,?)";
		
		try (PreparedStatement stm = connection.prepareStatement(query)) {
			stm.setString(1, d.getMatricolaProf());
			stm.setString(2, d.getNomeProf());
			stm.setString(3, d.getCognomeProf());
		
			stm.close();
			DBManager.closeConnection();
		
		}catch (SQLException ex) {
			throw new SQLException();
		}
	}

}
