package com.thymleaf.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thymleaf.model.Formateur;

public interface FormateurInterface extends JpaRepository<Formateur, Integer> {

	
	
	List<Formateur> findByNomOrPrenom(String nom, String prenom);
	List<Formateur> findByEmail(String email);
	
}
