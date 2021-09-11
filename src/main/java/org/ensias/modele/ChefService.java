package org.ensias.modele;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChefService {
  @Autowired
  private ChefRepo chefrepo;
  
    
  public List<Chef> getAllChefs() {
		List<Chef> chef=new ArrayList<>();
		chefrepo.findAll().forEach(chef::add);
		//moduleRepository.findAll().forEach(m->modules.add(m));
		return chef; 

				}
	public void ajouterChef(Chef ch) {
    	chefrepo.save(ch);

	}
    
    public void modifierChef(Integer id, Chef ch) {
		chefrepo.save(ch);
	}

    
    public void supprimerChef(long id) {
		chefrepo.deleteById(id);
	}
}
