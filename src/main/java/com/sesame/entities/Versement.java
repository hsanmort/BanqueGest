package com.sesame.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.context.annotation.Description;

@Entity
@DiscriminatorValue("V")
@Table(name = "t_versement")
public class Versement extends Operation implements Serializable {

	//constructor
	public Versement() {
		super();
	}
	
	

}