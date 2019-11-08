package sevice;
import metier.Personne;

import java.util.Date;
import java.util.List;

import metier.Annonce;

public interface iservice {
	 public int creerPersonne(List<Personne> list, Personne personne);
	 public Personne getPersonne(List<Personne> list,int idPersonne);
	 public void deletePersonne(List<Personne> list,int idPersonne);
	 public void updatePersonne(List<Personne> list,Personne p, String nom, String prenom, Date dateNaissance);
	 public List<Personne> findAllPersonnes();
	 public int getPersonneId(List<Personne> list,Personne p);
	 public void affichePersonnes();
	 public void afficheAnnoncesPersonne(Personne p);
	 public int creerAnnonce(Personne personne, Annonce a);
	 public Annonce getAnnonce(Personne personne,int idAnnonce);
	 public void deleteAnnonce(Personne personne,int idAnnonce);
	 public void updateAnnonce(Personne personne,Annonce a, Annonce b);
	 public List<Annonce> findAllAnnonce(Personne personne);

}
