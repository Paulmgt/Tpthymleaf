package com.thymleaf.model;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Formateur implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	private String nom;
	
	@NotBlank
	private String prenom;
	
	@NotBlank
	private String mdp;
	
	@NotNull
	@Min(value = 18)
	private int age;
	
	@NotNull
	private int recrutement;
	
	private String grade;
	
	@NotBlank
	private String tel;
	
	@Email
	private String email;

	@Override
	public String toString() {
		return "Formateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mdp=" + mdp + ", age=" + age
				+ ", recrutement=" + recrutement + ", grade=" + grade + ", tel=" + tel + ", email=" + email + "]";
	}

	public Formateur() {
	
	}

	public Formateur(@NotBlank String nom, @NotBlank String prenom, @NotBlank String mdp, @NotNull @Min(18) int age,
			@NotNull int recrutement, String grade, @NotBlank String tel, @NotBlank String email) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.mdp = mdp;
		this.age = age;
		this.recrutement = recrutement;
		this.grade = grade;
		this.tel = tel;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRecrutement() {
		return recrutement;
	}

	public void setRecrutement(int recrutement) {
		this.recrutement = recrutement;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
	
	
	
}
