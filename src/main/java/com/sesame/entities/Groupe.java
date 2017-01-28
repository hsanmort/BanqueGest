package com.sesame.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_groupe")
public class Groupe implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numGroupe;
	
	private String nomGroupe;
	
	@ManyToMany(mappedBy="groupes",cascade={CascadeType.MERGE,CascadeType.PERSIST})
	private List<Employe> employes;

	
	//constructor
	public Groupe() {
		super();
	}

	public Groupe(String nomGroupe, List<Employe> employes) {
		super();
		this.nomGroupe = nomGroupe;
		this.employes = employes;
	}

	//getters & setters
	public Long getNumGroupe() {
		return numGroupe;
	}

	public void setNumGroupe(Long numGroupe) {
		this.numGroupe = numGroupe;
	}

	public String getNomGroupe() {
		return nomGroupe;
	}

	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}

	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

}