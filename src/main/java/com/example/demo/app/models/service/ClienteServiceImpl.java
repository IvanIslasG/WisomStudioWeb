package com.example.demo.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.app.models.entity.Cliente;
import com.example.demo.app.models.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements iClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> listarTodos() {
		
		return (List<Cliente>) clienteRepository.findAll();
	}

	@Override
	public void guardar(Cliente cliente) {
		clienteRepository.save(cliente);

	}

	@Override
	public Cliente buscarPorId(Long id) {
		
		return clienteRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		clienteRepository.deleteById(id);

	}

}
