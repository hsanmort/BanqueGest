package com.sesame.metier;

import java.util.List;

import com.sesame.entities.Employe;

public interface EmployeMetier {
	public Employe saveEmploye (Employe emp);
	public List<Employe> listEmployes();

	public void deleteEmploye(Long codeEmploye);
	public Employe updateEmploye(Employe emp);
}
