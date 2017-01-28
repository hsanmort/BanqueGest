package com.sesame.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sesame.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, String> {
	@Query("select c from Compte c where c.numCompte like :x")
	public Compte CompteParMC(@Param("x")String mc);
	public Compte findByNumCompte(String Num);

}
