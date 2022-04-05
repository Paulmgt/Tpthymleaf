package com.thymleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.thymleaf.model.Formation;
import com.thymleaf.service.FormationService;



@Controller
@RequestMapping()
public class FormationController {

	@Autowired
	FormationService formationService;

	@GetMapping("index")
	public String Page1(Model m ) {
		
		
		List<Formation> formations = formationService.SelectAll();
		
//		if(titre == null) {
			
//			formations = formationService.SelectAll();	
//		}
			
//		else {
			
//		formations = formationService.filtreTitreUnique(titre);
			
//		}
		
		Formation formation = new Formation();
		m.addAttribute("formation", formation);
		m.addAttribute("formations", formations);
		return "index.html";
	}

	@PostMapping("save")
	public String createformation(@ModelAttribute(name = "formation") Formation formation) {
		formationService.saveFormation(formation);
		return "redirect:/index";
	}

	@RequestMapping(value = "delete/{id}", method = { RequestMethod.GET, RequestMethod.DELETE })
	public String supression(@PathVariable int id) {
		formationService.delete(id);
		return "redirect:/index";
	}

//	@GetMapping("titre")
//	public String titrefiltre(Model m) {
//		List<Formation> formation = formationService.filtreTitreUnique(null);

//		Formation formations = new Formation();
//		m.addAttribute("formation", formation);
//		m.addAttribute("formations", formations);
//
//		return "index.html";
//	}

}
