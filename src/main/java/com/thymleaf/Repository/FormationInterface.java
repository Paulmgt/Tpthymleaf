package com.thymleaf.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thymleaf.model.Formation;

public interface FormationInterface extends JpaRepository<Formation, Integer> {

	List<Formation> findByTitre(String titre);
	
}
