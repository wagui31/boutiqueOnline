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
public class Article {
	@Id @GeneratedValue
	private Long id;
	@Column(name="nom", length=50, nullable=false)
	private String nom;
	@Column(name="type", length=50, nullable=false)
	private String type;
	@Column(name="quantiteStock", columnDefinition = "int default 0")
	private Integer quantiteStock;
	@Column(name="quantiteVendu", columnDefinition= "int default 0")
	private Integer quantiteVendu;
	@Column(name="prix", nullable=false)
	private Double prix;
}
