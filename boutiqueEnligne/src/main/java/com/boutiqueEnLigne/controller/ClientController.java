package com.boutiqueEnLigne.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boutiqueEnLigne.dao.IClientDao;
import com.boutiqueEnLigne.entities.Client;

@RestController
public class ClientController {

	@Autowired
	private IClientDao clientRepository;

	@GetMapping("/clients")
	public List<Client> findAllClient()
	{
		return clientRepository.findAll();
	}
	
	
	@GetMapping("/client/{id}")
	public Client findClientById(@PathVariable Long id)
	{
		return clientRepository.findById(id).orElse(null);
	}
	
	
	@GetMapping("client/ByNom/{nom}")
	public List<Client> findCLientByNom(@PathVariable String nom)
	{
		return clientRepository.findByNomContains(nom);
	}
	
	@PutMapping("/client/{id}")
	public Client addClient(Long id, Client client)
	{
		client.setId(id);
		
		return clientRepository.save(client);
	}
	
	@DeleteMapping("client/{id}")
	public void supprimerClient(Long id)
	{
		clientRepository.deleteById(id);
	}
	
}
