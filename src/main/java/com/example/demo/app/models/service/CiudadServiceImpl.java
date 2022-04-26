package com.example.demo.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.app.models.entity.Ciudad;
import com.example.demo.app.models.repository.CiudadRepository;

@Service
public class CiudadServiceImpl implements iCiudadService {

	@Autowired
	private CiudadRepository ciudadRepository;
	
	@Override
	public List<Ciudad> listaCiudades() {
		
		return (List<Ciudad>) ciudadRepository.findAll();
	}

}
