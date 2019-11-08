package lanceur;

import java.util.Date;

import metier.Personne;
import metier.Annonce;
import sevice.methode;

public class test {

	public static void main(String[] args) {
		//Personne(int personneId, String nom, String prenom, String login, String motdepasse, Date datedenaissance)
		Personne a= new Personne(1,"braham","moussouni","brahamax","gg",new Date());
		Personne b= new Personne(2,"Abdellah","moussouni","chaboox","gg",new Date());
		
		//Annonce(int idAnnonce, String intitule, String detail, Double prix) 
		Annonce an = new Annonce (1, "Ensup", "sjkdhgqsjdbj",20.99);
		Annonce bn = new Annonce (2, "Hetic", "sjkdhgqsjdbj",30.99);
		
		methode m = new methode();
		m.creerPersonne(Personne.getBase(), a);
		m.creerPersonne(Personne.getBase(), b);
		m.creerAnnonce(a, an);
		m.creerAnnonce(b, bn);
		
		m.afficheAnnoncesPersonne(a);
		m.affichePersonnes();
		m.findAllAnnonce(a);
		m.findAllPersonnes();
		m.deleteAnnonce(a, 1);
		m.deletePersonne(Personne.getBase(), 2);
		m.getAnnonce(a, 1);
		m.getPersonne(Personne.getBase(), 1);
		m.updatePersonne(Personne.getBase(), a, "Braham", "Abdellah", new Date());
		m.updateAnnonce(a, an, bn);
	
		
		
	}

}
