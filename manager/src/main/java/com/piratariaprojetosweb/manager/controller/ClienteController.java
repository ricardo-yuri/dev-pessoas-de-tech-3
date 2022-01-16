package com.piratariaprojetosweb.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piratariaprojetosweb.manager.entity.Cliente;
import com.piratariaprojetosweb.manager.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	List<Cliente> buscarCliente(){
		return clienteService.buscarClientes();
	}
	
	@PostMapping
	void cadastrarCliente(@RequestBody Cliente cli) {
		clienteService.cadastrarCliente(cli);
	}

}
