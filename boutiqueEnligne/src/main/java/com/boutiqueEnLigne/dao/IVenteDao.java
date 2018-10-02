package com.boutiqueEnLigne.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boutiqueEnLigne.entities.Vente;

public interface IVenteDao extends JpaRepository<Vente, Long>{

}
