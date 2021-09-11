package org.ensias.modele;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
  @Autowired
  private ClientRepo clientrepo;
  
    
  public List<Client> getAllClients() {
		List<Client> client=new ArrayList<>();
		clientrepo.findAll().forEach(client::add);
		//moduleRepository.findAll().forEach(m->modules.add(m));
		return client; 

				}
	public void ajouterClient(Client c) {
    	clientrepo.save(c);

	}
    
    public void modifierClient(Integer id, Client c) {
		clientrepo.save(c);
	}

    
    public void supprimerClient(long id) {
		clientrepo.deleteById(id);
	}
}
