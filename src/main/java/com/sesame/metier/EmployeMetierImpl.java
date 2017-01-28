package com.sesame.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.dao.EmployeRepository;
import com.sesame.entities.Employe;

@Service
public class EmployeMetierImpl implements EmployeMetier {

	@Autowired
	
	private EmployeRepository er;
	public Employe saveEmploye (Employe emp){
		
		return  er.save(emp);
		
	}
	public List<Employe> listEmployes(){
		return er.findAll();
		
	}

	public void deleteEmploye(Long codeEmploye){
		
		er.delete(codeEmploye);
		
	}
	public Employe updateEmploye(Employe emp){
		
		return er.saveAndFlush(emp);
		
	}
}
