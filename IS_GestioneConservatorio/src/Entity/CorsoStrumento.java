package Entity;

public class CorsoStrumento extends Corso {

private String strumento;
	
	public CorsoStrumento(String codice, String denominazione, int crediti, String strumento) {
		super(codice, denominazione, crediti);
		this.strumento = strumento;
	}

	public String getStrumento() {
		return strumento;
	}
	
	public void setStrumento(String strumento) {
		this.strumento = strumento;
	}
}
