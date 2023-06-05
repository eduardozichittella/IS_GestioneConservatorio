package main;

import boundary.*;

import java.sql.SQLException;
import database.*;
import boundary.*;

import java.util.*;

public class Main {
	
	public static void main(String[] args) throws SQLException{

		StudenteDAO.createStudenteTable();
		CorsoDAO.createCorsoTable();
 	    DocenteDAO.createDocenteTable();
		
		Scanner scan = new Scanner(System.in);
	
		int option = 0;
		
		System.out.println("Seleziona un' operazione:\n");
		System.out.println("Funzionalita' Segreteria studenti:");
		System.out.println("1 - Aggiungi Corso");
		System.out.println("2 - Aggiungi Docente");
		//System.out.println("3 - Consulta calendario corsi");
		//System.out.println("4 - Iscriviti");
		//System.out.println("Funzionalita' amministratore:");
		//System.out.println("5 - Stabilisci giorni e ora apertura");
		//System.out.println("6 - Pubblica una nuova news");
		//System.out.println("7 - Esci");				
		//System.out.flush();	
				
		try {
			option = scan.nextInt();
		} catch (NumberFormatException e) {
			option = 0;
		}
				
		switch (option) {
			case 1: { BoundarySegreteriaStudenti.AggiungiCorso();; break; }
			case 2: { BoundarySegreteriaStudenti.AggiungiDocente();; break; }
			//case 3: { BAbbonato.consultaCalendarioCorsi(); break; }
			//case 4: { BAbbonato.iscrizione(); break; }
			//case 5: { BAmministrazione.stabilisciGiorniEOrarioApertura(); break; }
			//case 6: { BAmministrazione.PubblicazioneNews(); break; }
			case 3: { break; }
			default: {
				System.out.println("Carattere inserito non riconosciuto!\n");
			}
		}
	
		
		scan.close();
						
		StudenteDAO.dropStudenteTable();
		CorsoDAO.dropCorsoTable();
 	    DocenteDAO.dropDocenteTable();
	}

}
