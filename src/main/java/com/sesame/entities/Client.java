package com.sesame.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_client")
public class Client implements Serializable {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long code;
	
	private String nom;
	
	@OneToMany(mappedBy="client",fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Compte> comptes;
	
	
	
	//Constructor
	public Client() {
		super();
	}
	
	public Client(String nom) {
		super();
		this.nom = nom;
	}

	//getters & setters
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}


	
}