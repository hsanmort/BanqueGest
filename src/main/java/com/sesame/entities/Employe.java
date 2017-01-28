package com.sesame.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@Table(name = "t_employe")
public class Employe implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeEmploye;
	
	private String nomEmploye;

	@ManyToOne
	@JoinColumn(name="Code_emp_sup")
	private Employe supHierarchique;
	
	@ManyToMany
	@JoinTable(name="Emp_Gr",joinColumns=
	@JoinColumn(name="Num_Emp"), inverseJoinColumns=
	@JoinColumn(name="Num_Groupe"))
	private List<Groupe> groupes;
	
	
	
	//constructor
	public Employe() {
		super();
	}
	
	

	public Employe(String nomEmploye, Employe supHierarchique,
			List<Groupe> groupes) {
		super();
		this.nomEmploye = nomEmploye;
		this.supHierarchique = supHierarchique;
		this.groupes = groupes;
	}



	//getters & setters
	
@JsonIgnore
	public Employe getSupHierarchique() {
		return supHierarchique;
	}

	public List<Groupe> getGroupes() {
		return groupes;
	}



	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}


@JsonSetter
	public void setSupHierarchique(Employe supHierarchique) {
		this.supHierarchique = supHierarchique;
	}

	public Long getCodeEmploye() {
		return codeEmploye;
	}

	public void setCodeEmploye(Long codeEmploye) {
		this.codeEmploye = codeEmploye;
	}

	public String getNomEmploye() {
		return nomEmploye;
	}

	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}

}