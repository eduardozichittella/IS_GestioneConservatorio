package Entity;

import java.util.Date;

public class Esame {

	private int voto;
	private boolean lode;
	private String noteProf;
	private Date data;
	
	public Esame (int voto, boolean lode, String noteProf, Date data) {
		this.voto = voto;
		this.lode = lode;
		this.noteProf = noteProf;
		this.data = data;
	}
	
	public int getVoto() {
		return voto;
	}
	
	public void setVoto(int voto) {
		this.voto = voto;
	}
	
	public boolean getLode() {
		return lode;
	}
	
	public void setLode(boolean lode) {
		this.lode = lode;
	}
	
	public String getNoteProf() {
		return noteProf;
	}
	
	public void setNoteProf(String noteProf) {
		this.noteProf = noteProf;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
}
