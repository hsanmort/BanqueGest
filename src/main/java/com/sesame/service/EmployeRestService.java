package com.sesame.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sesame.entities.Employe;
import com.sesame.metier.EmployeMetier;

@RestController

public class EmployeRestService {
	@Autowired
	private EmployeMetier em;
	
	@RequestMapping(value="/employes/save", method=RequestMethod.POST)
	public Employe save(@RequestBody Employe e) {
		return em.saveEmploye(e);
	}
	@RequestMapping(value="/employe/delete")
	public void deleteEmploye(Long codeEmploye){
		em.deleteEmploye(codeEmploye);
	}
	
	@RequestMapping(value="/employe/update")
	public Employe updateEmploye(Employe e){
		return em.updateEmploye(e);
	}

	@RequestMapping(value="/employes")
	public List<Employe> liste() {
		return em.listEmployes();
	}
}
