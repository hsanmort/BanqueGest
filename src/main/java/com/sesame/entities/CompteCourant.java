package com.sesame.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("CC")
@Table(name = "t_comptecourant")
public class CompteCourant extends Compte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Double decouvert;

	
	//constructor
	public CompteCourant() {
		super();
	}

	
	public CompteCourant(Double decouvert) {
		super();
		this.decouvert = decouvert;
	}


	public Double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(Double decouvert) {
		this.decouvert = decouvert;
	}
	

	
}