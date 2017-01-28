package com.sesame.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.dao.CompteRepository;

import com.sesame.entities.Compte;

@Service
public class CompteMetierImpl implements CompteMetier {

	@Autowired
	private CompteRepository co;
	
	
	public Compte saveCompte(Compte c) {
		
		return co.save(c);
	}

	public List<Compte> listeCompte() {
		
		return co.findAll();
	}
	
	public void deleteCompte(String numCompte) {
		
		co.delete(numCompte);
	}
	
	public Compte updateCompte(Compte c) {
		
		return co.saveAndFlush(c);
	}
	
	public Compte CompteParMC(String mc) {
			
			return  co.CompteParMC(mc);
		}

	public Compte findByNumCompte(String numCompte) {
		
		return co.findByNumCompte(numCompte);
		}






}
