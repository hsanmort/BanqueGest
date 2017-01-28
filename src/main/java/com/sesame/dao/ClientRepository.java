package com.sesame.dao;



import com.sesame.entities.Client;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientRepository extends JpaRepository<Client, Long> {
	@Query("select c from Client c where c.nom like :x")
	public List<Client> ClientParMC(@Param("x")String mc);
	public Client findBycode(Long code);
	
}
