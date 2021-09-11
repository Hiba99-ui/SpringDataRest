package org.ensias.web;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



/*
@RestController
public class ProprietaireController {

	@Autowired
	private ProprietaireService propservice;
    
	
	
	@RequestMapping("/proprietaires")
	public List<Proprietaire> getProps() { 
		return propservice.getAllProprietaires();

	} 
	
	
	@RequestMapping(method=RequestMethod.POST, value="/proprietaires")
	public void ajouterProprietaire(@RequestBody Proprietaire prop) {
		propservice.ajouterProprietaire(prop);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/proprietaires/{id}")
	public void modifierProprietaire(@RequestBody Proprietaire prop, @PathVariable int id) {
		propservice.modifierProprietaire(id, prop);	
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/proprietaires/{id}")
	 public void supprimerProprietaire(@PathVariable long id) {
			propservice.supprimerProprietaire(id);	
	 }
	

}*/
