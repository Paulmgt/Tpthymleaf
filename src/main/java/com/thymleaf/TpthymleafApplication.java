package com.thymleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thymleaf.model.Formateur;
import com.thymleaf.model.Formation;
import com.thymleaf.service.FormateurService;
import com.thymleaf.service.FormationService;

@SpringBootApplication
public class TpthymleafApplication implements CommandLineRunner{

	@Autowired
	FormationService formationServ;
	@Autowired
	FormateurService formateurServ;
	
	public static void main(String[] args) {
		SpringApplication.run(TpthymleafApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	//	formateurServ.saveFormateur(new Formateur("Duboisson", "Sophie", "testmdpor", 38, 2011, "3367939892244", "dubuissonSoph@acdmparis.fr" ));
	//	formateurServ.saveFormateur(new Formateur("Viaux", "Nathalie", "nathalieFrmdp", 43, 2009, "33679763829", "viauxacacdm@acdmparis.fr"));
		
	//	formationServ.saveFormation(new Formation("Science social", "histoire du monde moderne", 300.33));
	//	formationServ.saveFormation(new Formation("Latin appliquer", "apprendre à lire et ecrire en Latin", 500.34));
	}

}
