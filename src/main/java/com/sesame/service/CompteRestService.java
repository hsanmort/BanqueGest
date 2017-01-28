package com.sesame.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sesame.entities.Compte;
import com.sesame.metier.CompteMetier;

@RestController
public class CompteRestService {
	@Autowired 
	private CompteMetier cm;
	
	@RequestMapping(value="/comptes/save", method=RequestMethod.POST)
	public Compte save(@RequestBody Compte c) {
		return cm.saveCompte(c);
	}
	@RequestMapping(value="/compte/delete")
	public void deleteCompte(String numCompte){
		cm.deleteCompte(numCompte);
	}
	
	@RequestMapping(value="/compte/update")
	public Compte updateCompte(Compte c){
		return cm.updateCompte(c);
	}

	@RequestMapping(value="/comptes")
	public List<Compte> liste() {
		return cm.listeCompte();
	}
	@RequestMapping(value="/compte/findbycode")
	public Compte findByNumCompte(String numCompte) {
		return cm.findByNumCompte(numCompte);
	}


	@RequestMapping("/comptesParMC")
	public Compte CompteParMC(String mc){
	return cm.CompteParMC("%"+mc+"%");
	}

}
