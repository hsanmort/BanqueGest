package com.sesame.service;

import java.util.List;

import com.sesame.dao.ClientRepository;
import com.sesame.entities.Client;
import com.sesame.metier.ClientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientRestService {

	@Autowired
	private ClientMetier cm;


	@RequestMapping(value="/clients/save", method=RequestMethod.POST)
	public Client save(@RequestBody Client t) {
		return cm.saveClient(t);
	}
	@RequestMapping(value="/client/delete")
	public void deleteClient(Long code){
		cm.deleteClient(code);
	}
	
	@RequestMapping(value="/client/update")
	public Client updateClient(Client c){
		return cm.updateClient(c);
	}

	@RequestMapping(value="/clients")
	public List<Client> liste() {
		return cm.listeClient();
	}
	@RequestMapping(value="/client/findbycode")
	public Client findbycode(long code) {
		return cm.findBycode(code);
	}


	@RequestMapping("/clientsParMC")
	public List<Client> ClientParMC(String mc){
	return cm.ClientParMC("%"+mc+"%");
	}

	

	
	
	
	

	
	
}
