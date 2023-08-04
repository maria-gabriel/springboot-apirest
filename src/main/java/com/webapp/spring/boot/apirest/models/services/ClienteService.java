package com.webapp.spring.boot.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.spring.boot.apirest.models.dao.ClienteDaoInterface;
import com.webapp.spring.boot.apirest.models.entity.Cliente;

import jakarta.transaction.Transactional;

@Service
public class ClienteService implements ClienteServiceInterface {

	@Autowired
	private ClienteDaoInterface clienteDao;
	
	@Override
	@Transactional
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}

}
