package metier;
import java.util.Date;
import java.util.List;

public class Annonce {
	int idAnnonce;
	String intitule,detail;
	Double prix;
	List<Personne> personnes;
	
	
	public Annonce() {
		super();
	}
	
	public Annonce(int idAnnonce, String intitule, String detail, Double prix) {
		super();
		this.idAnnonce = idAnnonce;
		this.intitule = intitule;
		this.detail = detail;
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Annonce [idAnnonce=" + idAnnonce + ", intitule=" + intitule + ", detail=" + detail + ", prix=" + prix
				+ "]";
	}
	public int getIdAnnonce() {
		return idAnnonce;
	}
	public void setIdAnnonce(int idAnnonce) {
		this.idAnnonce = idAnnonce;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public List<Personne> getPersonnes() {
		return personnes;
	}
	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	} 
	
	
	
}
