package com.example.demo.app.models.service;

import java.util.List;

import com.example.demo.app.models.entity.Cliente;

public interface iClienteService {
	
	public List<Cliente> listarTodos();
	public void guardar(Cliente cliente);
	public Cliente buscarPorId(Long id);
	public void eliminar(Long id);

}
