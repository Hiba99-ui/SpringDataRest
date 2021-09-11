package org.ensias.web;


import java.util.List;

import org.ensias.modele.Offre;
import org.ensias.modele.OffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class OffreController {
	
	@Autowired
	private OffreService offreservice;
    
	
	
	@RequestMapping("/offres")
	public List<Offre> getoffres() { 
		return offreservice.getAllOffre();

	} 
	
	@RequestMapping("/offres/rabat")
	public List<Offre> getoffresrabat(){ 
		return offreservice.getAllOffreRabat();
	} 
	
	@RequestMapping("/offres/casablanca")
	public List<Offre> getoffrecasablanca(){ 
		return offreservice.getAllOffreCasablanca();
	} 
	@RequestMapping("/offres/marrakech")
	public List<Offre> getoffresmarrakech(){ 
		return offreservice.getAllOffreMarrakech();
	} 
	
	@RequestMapping("/offres/agadir")
	public List<Offre> getoffresagadir(){ 
		return offreservice.getAllOffreAgadir();
	} 
	
	@RequestMapping(method=RequestMethod.POST, value="/offres")
	public void ajouterOffre(@RequestBody Offre off) {
		offreservice.ajouterOffre(off);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/offres/{id}")
	public void modifierOffre(@RequestBody Offre off, @PathVariable int id) {
		offreservice.modifierOffre(id, off);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/offres/{id}")
	 public void supprimerOffre(@PathVariable long id) {
		offreservice.supprimerOffre(id);	
	 }


}
