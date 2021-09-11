package org.ensias.modele;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public class OffreService {
	@Autowired //pour l’injection des dépendances et éviter l’appel des new()
	private OffreRepo offrerepo;
	
	
	
	
	public List<Offre> getAllOffre() {
		List<Offre> offres=new ArrayList<>();
		offrerepo.findAll().forEach(offres::add);
		//moduleRepository.findAll().forEach(m->modules.add(m));
		return offres; 
				}
	
	public List<Offre> getAllOffreRabat() {
		List<Offre> offres=new ArrayList<>();
		offrerepo.findAll().forEach(offres::add);
		List<Offre> res=new ArrayList<>();
		for (Offre offre : offres) {
			if(offre.getVille().equals("Rabat")) res.add(offre);
		}
		return res; 
				}
	
	public List<Offre> getAllOffreCasablanca() {
		List<Offre> offres=new ArrayList<>();
		offrerepo.findAll().forEach(offres::add);
		List<Offre> res=new ArrayList<>();
		for (Offre offre : offres) {
			if(offre.getVille().equals("Casablanca")) res.add(offre);
		}
		return res; 
				}
	
	public List<Offre> getAllOffreMarrakech() {
		List<Offre> offres=new ArrayList<>();
		offrerepo.findAll().forEach(offres::add);
		List<Offre> res=new ArrayList<>();
		for (Offre offre : offres) {
			if(offre.getVille().equals("Marrakech")) res.add(offre);
		}
		return res; 
				}
	
	public List<Offre> getAllOffreAgadir() {
		List<Offre> offres=new ArrayList<>();
		offrerepo.findAll().forEach(offres::add);
		List<Offre> res=new ArrayList<>();
		for (Offre offre : offres) {
			if(offre.getVille().equals("Agadir")) res.add(offre);
		}
		return res; 
				}
	
	
	
	
	
	/*public List<Offre> findByVille(@Param("ville") String ville){
		List<Offre> offres= (List<Offre>) offrerepo.findAll();
		List<Offre> res=new ArrayList<>();
		for (Offre offre : offres) {
			if(offre.getVille().equals(ville)) res.add(offre);
		}
		return res;
	}*/
	/*public List<Offre> getAllOffreVille(String ville) {
		List<Offre> offres=new ArrayList<>();
		offrerepo.findByVille(ville).forEach(offres::add);
		//moduleRepository.findAll().forEach(m->modules.add(m));
		return offres; 

				}*/
	
	public void ajouterOffre(Offre off) {
		offrerepo.save(off); 
		
	}
	
	public void modifierOffre(Integer id,Offre off) {
		offrerepo.save(off); 
		//ici save dans le rôle de la mise à jour
	}
	
	public void supprimerOffre(long id) {
		offrerepo.deleteById(id);
	}

}
