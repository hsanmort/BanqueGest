package com.sesame.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("R")
@Table(name = "t_retrait")
public class Retrait extends Operation implements Serializable {

	//constructor
	public Retrait() {
		super();
	}
	
	

}