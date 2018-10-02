package com.boutiqueEnLigne.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boutiqueEnLigne.entities.Client;

public interface IClientDao extends JpaRepository<Client, Long>{

	
	public List<Client> findByNomContains(String nom);
}
