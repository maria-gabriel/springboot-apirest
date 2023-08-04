package com.webapp.spring.boot.apirest.models.services;

import java.util.List;

import com.webapp.spring.boot.apirest.models.entity.Cliente;

public interface ClienteServiceInterface {

	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save (Cliente cliente);
	
	public void delete (Long id);
	
}
