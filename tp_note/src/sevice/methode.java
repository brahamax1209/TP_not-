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
		return Personne.getBase();
	}

	
	public int getPersonneId(List<Personne> list, Personne p) {
		for(Personne personne: list) {
			if(personne.getPersonneId()==p.getPersonneId()) {
				return p.getPersonneId();
			}}
			return 0;
	}

	
	public void affichePersonnes() {
		System.out.println(Personne.getBase().toString());
		
	}


	public void afficheAnnoncesPersonne(Personne p) {
		for(Annonce annonce : p.getAnnonces()) {
			System.out.println(annonce);
		}
	
	}

	
	public int creerAnnonce(Personne personne, Annonce a) {
		personne.getAnnonces().add(a);
		return 0;
	}

	
	public Annonce getAnnonce(Personne personne, int idAnnonce) {
		for(Annonce annonce : personne.getAnnonces()) {
			if(annonce.getIdAnnonce()==idAnnonce) {
				return annonce;
			}
		}
		return null;
	}

	
	public void deleteAnnonce(Personne personne, int idAnnonce) {
		for(Annonce annonce : personne.getAnnonces()) {
			if(annonce.getIdAnnonce()==idAnnonce) {
				personne.getAnnonces().remove(annonce);
			}
		}
		
	}

	
	public void updateAnnonce(Personne personne, Annonce a, Annonce b) {
		for(Annonce annonce : personne.getAnnonces()) {
			if(annonce.getIdAnnonce()==a.getIdAnnonce()) {
				a=b;
			}
			}
		
	}

	
	public List<Annonce> findAllAnnonce(Personne personne) {
		return personne.getAnnonces();
	}



	

}
