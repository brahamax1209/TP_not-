package sevice;

import java.util.Date;
import java.util.List;

import metier.Annonce;
import metier.Personne;

public class methode implements iservice {

	public int creerPersonne(List<Personne> list, Personne personne) {
		list.add(personne);
		return 0;
	}

	
	public Personne getPersonne(List<Personne> list, int idPersonne) {
		for(Personne personne: list) {
			if(personne.getPersonneId()==idPersonne) {
				return personne;
			}
		}
		return null;
	}


	public void deletePersonne(List<Personne> list, int idPersonne) {
		for(Personne personne: list) {
			if(personne.getPersonneId()==idPersonne) {
				list.remove(personne);
			}
		}
		
	}

	
	public void updatePersonne(List<Personne> list, Personne p, String nom, String prenom, Date dateNaissance) {
		for(Personne personne: list) {
			if(personne.getPersonneId()==p.getPersonneId()) {
				personne.setNom(nom);
				personne.setDatedenaissance(dateNaissance);
				personne.setPrenom(prenom);
			}
		}
	}

	
	public List<Personne> findAllPersonnes() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int getPersonneId(List<Personne> list, Personne p) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public void affichePersonnes() {
		// TODO Auto-generated method stub
		
	}


	public void afficheAnnoncesPersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	
	public int creerAnnonce(Personne personne, Annonce a) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public Annonce getAnnonce(Personne personne, int idAnnonce) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void deleteAnnonce(Personne personne, int idAnnonce) {
		// TODO Auto-generated method stub
		
	}

	
	public void updateAnnonce(Personne personne, Annonce a) {
		// TODO Auto-generated method stub
		
	}

	
	public List<Annonce> findAllAnnonce(Personne personne) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
