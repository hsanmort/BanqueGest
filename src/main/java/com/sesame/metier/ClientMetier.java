package com.sesame.metier;

import java.util.List;

import com.sesame.entities.Client;

public interface ClientMetier  {
	public Client saveClient(Client c);
	public List<Client> listeClient();
	public void deleteClient(Long code);
	public Client updateClient(Client c);
	public Client findBycode(Long code);
	public List<Client> ClientParMC(String mc);
}
