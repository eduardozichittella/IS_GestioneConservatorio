package Entity;

public class Studente {

	private String matricolaStud;
	private String nomeStud;
	private String cognomeStud;
	private String username;
	private String password;
	private long pin;
	
	public Studente (String matricolaStud, String nomeStud, String cognomeStud, 
			String username, String password, long pin) {
		this.matricolaStud = matricolaStud;
		this.nomeStud = nomeStud;
		this.cognomeStud = cognomeStud;
		this.username = username;
		this.password = password;
		this.pin = pin;
	}
	
	public String getMatricolaStud() {
		return matricolaStud;
	}
	
	public void setMatricolaStud(String matricolaStud) {
		this.matricolaStud = matricolaStud;
	}
	
	public String getNomeStud() {
		return nomeStud;
	}
	
	public void setNomeStud(String nomeStud) {
		this.nomeStud = nomeStud;
	}
	
	public String getCognomeStud() {
		return cognomeStud;
	}
	
	public void setCognomeStud(String cognomeStud) {
		this.cognomeStud = cognomeStud;
	}
	
	public String getUsernameStud() {
		return username;
	}
	
	public void setUsernameStud(String username) {
		this.username = username;
	}
	
	public String getPasswordStud() {
		return password;
	}
	
	public void setPasswordStud(String password) {
		this.password = password;
	}
	
	public long getPinStud() {
		return pin;
	}
	
	public void setPinStud(long pin) {
		this.pin = pin;
	}
}
