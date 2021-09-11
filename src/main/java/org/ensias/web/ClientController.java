package org.ensias.web;

import java.util.List;

import org.ensias.modele.ClientService;
import org.ensias.modele.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientController {
	
	@Autowired
	private ClientService clientservice;
   
	@RequestMapping("/clients")
	public List<Client> getclient() { 
		return clientservice.getAllClients();

	} 
	
	@RequestMapping(method=RequestMethod.POST, value="/clients")
	public void ajouterClient(@RequestBody Client c) {
		clientservice.ajouterClient(c);
	}
}
