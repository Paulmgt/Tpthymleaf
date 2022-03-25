package com.thymleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymleaf.Repository.FormateurInterface;
import com.thymleaf.model.Formateur;
import com.thymleaf.model.Formation;

@Service
public class FormateurService {

	
	@Autowired
	private  FormateurInterface formateurInterface;
	
	public Formateur saveFormateur(Formateur f) {
		
		return formateurInterface.save(f);
	}
	
	
	public Optional<Formateur> searchById(int id)
	{
		return formateurInterface.findById(id);
		
	}
	public void delete(int id) {
		
		formateurInterface.deleteById(id);
	}
	
	public List<Formateur> filtreNomOuPrenom(String nom, String prenom)  {
		
		return formateurInterface.findByNomOrPrenom(nom, prenom);
	}
	
	public List<Formateur> filtreEmail(String email)  {
		
		return formateurInterface.findByEmail(email);
	}
	
public List<Formateur> SelectAll() {
		
		return formateurInterface.findAll();
	}
}
