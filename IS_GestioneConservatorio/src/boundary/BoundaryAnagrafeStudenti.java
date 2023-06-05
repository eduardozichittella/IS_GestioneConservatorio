package boundary;

import java.util.ArrayList;
import entity.*;
import control.GestioneConservatorio;
import java.sql.SQLException;
import java.util.Scanner;
import java.io.BufferedInputStream;

public class BoundaryAnagrafeStudenti {
	
	public static void AggiungiStudente() throws SQLException {
		Scanner in = new Scanner(new BufferedInputStream(System.in)); //Lettura da tastiera
		
		System.out.print("Inserisci la nuova Matricola: ");
        String matricola = in.next();
        
		System.out.print("Inserisci il nome: ");
        String nome = in.next();
        
        System.out.print("Inserisci il cognome: ");
        String cognome = in.next();
        
        System.out.print("Inserisci l'username: ");
        String username = in.next();
        
        System.out.print("Inserisci la password: ");
        String password = in.next();
        
        System.out.print("Inserisci il PIN: ");
        long pin = in.nextLong();
        
        EntityStudente s = new EntityStudente(matricola, nome, cognome, username, password, pin);
        
        GestioneConservatorio.getInstance().AggiungiStudente(s);
	}

}
