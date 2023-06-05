package boundary;

import java.util.ArrayList;
import entity.*;
import control.GestioneConservatorio;
import java.sql.SQLException;
import java.util.Scanner;
import java.io.BufferedInputStream;


public class BoundarySegreteriaStudenti {
	
	public static void AggiungiCorso() throws SQLException {
		Scanner in = new Scanner(new BufferedInputStream(System.in)); //Lettura da tastiera
		
		System.out.print("Inserisci il nuovo Codice: ");
        String codice = in.next();
        
		System.out.print("Inserisci la Denominazine: ");
        String denominazione = in.next();
        
        System.out.print("Inserisci i CFU: ");
        int cfu = in.nextInt();
        
        EntityCorso c = new EntityCorso(codice, denominazione, cfu);
        
        GestioneConservatorio.getInstance().AggiungiCorso(c);
	}
	
	public static void AggiungiDocente() throws SQLException {
		Scanner in = new Scanner(new BufferedInputStream(System.in)); //Lettura da tastiera
		
		System.out.print("Inserisci la nuova Matricola: ");
        String matricola = in.next();
        
		System.out.print("Inserisci il nome: ");
        String nome = in.next();
        
        System.out.print("Inserisci il cognome: ");
        String cognome = in.next();
        
        EntityDocente d = new EntityDocente(matricola, nome, cognome);
        
        GestioneConservatorio.getInstance().AggiungiDocente(d);
	}
	
	

}
