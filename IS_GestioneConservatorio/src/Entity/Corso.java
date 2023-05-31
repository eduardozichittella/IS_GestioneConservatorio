package Entity;

public class Corso {

	private String codice;
	private String denominazione;
	private int crediti;
	
	public Corso (String codice, String denominazione, int crediti) {
		this.codice = codice;
		this.denominazione = denominazione;
		this.crediti = crediti;
	}
	
	public String getCodice () {
		return codice;
	}
	
	public void setCodice(String codice) {
		this.codice = codice;
	}
	
	public String getDenominazione () {
		return denominazione;
	}
	
	public void setDenominazione (String denominazione) {
		this.denominazione = denominazione;
	}
	
	public int getCrediti() {
		return crediti;
	}
	
	public void setCrediti(int crediti) {
		this.crediti = crediti;
	}
}
