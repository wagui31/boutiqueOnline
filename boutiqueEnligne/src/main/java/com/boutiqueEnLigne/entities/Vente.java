package com.boutiqueEnLigne.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Vente {
	
	private Long id;
	private Date date;
	private Double prix;
	private String commentaire;
	
	@ManyToOne
	@JoinColumn(name="ID_VENTE_ARTICLE")
	private Article id_Article;
	
	@ManyToOne
	@JoinColumn(name="ID_VENTE_CLIENT")
	private Client id_Client;

}
