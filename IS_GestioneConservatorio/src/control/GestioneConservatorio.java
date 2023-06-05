package control;

import java.sql.SQLException;
import java.util.ArrayList;

import database.*;
import entity.*;


public class GestioneConservatorio {
	
private static GestioneConservatorio instance;
	
	public static GestioneConservatorio getInstance() {
		if(instance == null) {
			instance = new GestioneConservatorio();
		}
		return instance;
	}

public void AggiungiStudente(EntityStudente s) throws SQLException {
	StudenteDAO.iscrizione(s);
}

public void AggiungiCorso(EntityCorso c) throws SQLException {
	CorsoDAO.creazioneCorso(c);;
}

public void AggiungiDocente(EntityDocente d) throws SQLException {
	DocenteDAO.iscrizioneDocente(d);
}

}
