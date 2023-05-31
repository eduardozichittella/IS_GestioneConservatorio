package Entity;

public class Docente {

	private String matricolaProf;
	private String nomeProf;
	private String cognomeProf;
	
	public Docente (String matricolaProf, String nomeProf, String cognomeProf) {
		this.matricolaProf = matricolaProf;
		this.nomeProf = nomeProf;
		this.cognomeProf = cognomeProf;
	}
	
	public String getMatricolaProf() {
		return matricolaProf;
	}
	
	public void setMatricolaProf(String matricolaProf) {
		this.matricolaProf = matricolaProf;
	}
	
	public String getNomeProf() {
		return nomeProf;
	}
	
	public void setNomeProf(String nomeProf) {
		this.nomeProf = nomeProf;
	}
	
	public String getCognomeProf() {
		return cognomeProf;
	}
	
	public void setCognomeProf(String cognomeProf) {
		this.cognomeProf = cognomeProf;
	}
}
