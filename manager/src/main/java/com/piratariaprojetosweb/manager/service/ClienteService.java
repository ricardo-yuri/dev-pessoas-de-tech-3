package com.piratariaprojetosweb.manager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.piratariaprojetosweb.manager.entity.Cliente;
import com.piratariaprojetosweb.manager.repository.ClienteRepository;

@Service
public class ClienteService {

	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public List<Cliente> buscarClientes() {
		return clienteRepository.findAll();
	}

	public void cadastrarCliente(Cliente cliente) {
		clienteRepository.save(cliente);
	}

}
