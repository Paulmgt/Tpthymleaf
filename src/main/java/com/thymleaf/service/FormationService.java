package com.thymleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymleaf.Repository.FormationInterface;
import com.thymleaf.model.Formation;



@Service
public class FormationService {

	
	@Autowired
	private  FormationInterface formationInterface;
	
	public Formation saveFormation(Formation f) {
		
		return formationInterface.save(f);
	}
	
	
	public Optional<Formation> searchById(int id)
	{
		return formationInterface.findById(id);
		
	}
	public void delete(int id) {
		
		formationInterface.deleteById(id);
	}
	
	public List<Formation> filtreTitreUnique(String titre) {
		
		return formationInterface.findByTitre(titre);
	}
	
	public List<Formation> SelectAll() {
		
		return formationInterface.findAll();
	}

	
}
