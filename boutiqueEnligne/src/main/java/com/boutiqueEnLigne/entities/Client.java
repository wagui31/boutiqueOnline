package com.boutiqueEnLigne.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Client {
	
	@Id @GeneratedValue
	private Long id;
	@Column(name="nom",length=50,nullable=false)
	private String nom;
	@Column(name="prenom",length=50,nullable=false)
	private String prenom;
	@Column(name="tel",length=20)
	private String tel;
	@Column(name="email",length=20)
	private String email;
	@Column(name="adresse",length=50)
	private String adresse;
	@Column(name="profession",length=20)
	private String profession;
	
	

}
