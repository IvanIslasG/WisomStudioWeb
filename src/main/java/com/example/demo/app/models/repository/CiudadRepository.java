package com.example.demo.app.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.app.models.entity.Ciudad;

public interface CiudadRepository extends CrudRepository<Ciudad, Long> {

}
