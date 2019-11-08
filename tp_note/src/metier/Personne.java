package metier;
import java.util.Date;
import java.util.List;

public class Personne {
	private int personneId;
	private String nom,prenom,login,motdepasse;
	private Date datedenaissance;
	private List<Annonce> annonces;
	private static List<Personne> base; 

public static List<Personne> getBase() {
		return base;
	}
	public static void setBase(List<Personne> base) {
		Personne.base = base;
	}


public List<Annonce> getAnnonces() {
		return annonces;
	}
	public void setAnnonces(List<Annonce> annonces) {
		this.annonces = annonces;
	}
@Override
public String toString() {
	return "Personne [personneId=" + personneId + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login
			+ ", motdepasse=" + motdepasse + ", datedenaissance=" + datedenaissance + "]";
}
public int getPersonneId() {
	return personneId;
}
public void setPersonneId(int personneId) {
	this.personneId = personneId;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getMotdepasse() {
	return motdepasse;
}
public void setMotdepasse(String motdepasse) {
	this.motdepasse = motdepasse;
}
public Date getDatedenaissance() {
	return datedenaissance;
}
public void setDatedenaissance(Date datedenaissance) {
	this.datedenaissance = datedenaissance;
}
public Personne(int personneId, String nom, String prenom, String login, String motdepasse, Date datedenaissance) {
	super();
	this.personneId = personneId;
	this.nom = nom;
	this.prenom = prenom;
	this.login = login;
	this.motdepasse = motdepasse;
	this.datedenaissance = datedenaissance;
}

public Personne() {
	super();
	
}

	
}
