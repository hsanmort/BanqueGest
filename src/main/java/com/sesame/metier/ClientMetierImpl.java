package com.sesame.metier;

import java.awt.print.Pageable;
import java.util.List;

import com.sesame.dao.ClientRepository;
import com.sesame.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class ClientMetierImpl implements ClientMetier {

	@Autowired
	private ClientRepository cl;
	
	
	public Client saveClient(Client c) {
		
		return cl.save(c);
	}

	public List<Client> listeClient() {
		
		return cl.findAll();
	}
	
	public void deleteClient(Long code) {
		
		cl.delete(code);
	}
	
	public Client updateClient(Client c) {
		
		return cl.saveAndFlush(c);
	}
	
	public List<Client> ClientParMC(String mc) {
			
			return  cl.ClientParMC(mc);
		}

	public Client findBycode(Long code) {
		
		return cl.findBycode(code);
	}


}
