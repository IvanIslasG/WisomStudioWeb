package com.example.demo.app.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.app.models.entity.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

	
}
