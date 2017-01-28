package com.sesame.metier;

import java.util.List;

import com.sesame.entities.Compte;

public interface CompteMetier {
	public Compte saveCompte(Compte c);
	public List<Compte> listeCompte();
	public void deleteCompte(String numCompte);
	public Compte updateCompte(Compte c);
	public Compte findByNumCompte(String numCompte);
	public Compte CompteParMC(String mc);
}
