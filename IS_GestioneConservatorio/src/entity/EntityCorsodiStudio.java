package entity;

//import java.util.*;

public class EntityCorsodiStudio {

	private String nomeCorsodiStudi;
	private String descrizione;
	//TODO : corsi_inclusi[]
	//private Map<String, ArrayList<String>> multiValueMap = new HashMap<String,ArrayList<String>>();
	
	public EntityCorsodiStudio(String nomeCorsodiStudi, String descrizione/*,
			Map<String, ArrayList<String>> multiValueMap*/) {
		this.nomeCorsodiStudi = nomeCorsodiStudi;
		this.descrizione = descrizione;
		//this.setMultiValueMap(multiValueMap);
	}
	
	public String getNomeCorsodiStudi() {
		return nomeCorsodiStudi;
	}
	
	public void setNomeCorsodiStudi(String nomeCorsodiStudi) {
		this.nomeCorsodiStudi = nomeCorsodiStudi;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

//	public Map<String, ArrayList<String>> getMultiValueMap() {
//		return multiValueMap;
//	}
//
//	public void setMultiValueMap(Map<String, ArrayList<String>> multiValueMap) {
//		this.multiValueMap = multiValueMap;
//	}
}
