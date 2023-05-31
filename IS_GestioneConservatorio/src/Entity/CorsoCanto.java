package Entity;

public class CorsoCanto extends Corso {

private String tipoCanto;
	
	public CorsoCanto(String codice, String denominazione, int crediti, String tipoCanto) {
		super(codice, denominazione, crediti);
		this.tipoCanto = tipoCanto;
	}

	public String getTipoCanto() {
		return tipoCanto;
	}
	
	public void setTipoCanto(String tipoCanto) {
		this.tipoCanto = tipoCanto;
	}
}
