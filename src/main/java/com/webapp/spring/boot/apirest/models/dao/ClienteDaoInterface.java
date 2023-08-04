package com.webapp.spring.boot.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.webapp.spring.boot.apirest.models.entity.Cliente;

public interface ClienteDaoInterface extends CrudRepository<Cliente, Long> {

}
