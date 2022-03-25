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

import com.thymleaf.model.Formateur;
import com.thymleaf.service.FormateurService;



@Controller
public class FormateurController {

	@Autowired
	FormateurService formateurService;
	
	@GetMapping("formateur")
	public String Page1(Model m) {
		List<Formateur> formateurs = formateurService.SelectAll();
		Formateur formateur = new Formateur();
		m.addAttribute("formateur", formateur);
		m.addAttribute("formateurs", formateurs);
		return "formateur.html";
	}

	@PostMapping("saveformateur")
	public String createformateur(@ModelAttribute(name = "formateur") Formateur formateur) {
		formateurService.saveFormateur(formateur);
		return "formateur";
	}

	@RequestMapping(value = "deleteformateur/{id}", method = { RequestMethod.GET, RequestMethod.DELETE })
	public String supression(@PathVariable int id) {
		formateurService.delete(id);
		return "^formateur";
	}
}
