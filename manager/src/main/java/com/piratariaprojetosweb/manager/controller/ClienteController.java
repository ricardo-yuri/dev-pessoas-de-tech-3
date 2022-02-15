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
@RequestMapping(value = "/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/listar")
	List<Cliente> findAll(){
		return clienteService.findAll();
	}
	
	@PostMapping("/cadastrar")
	void cadastrarCliente(@RequestBody Cliente cli) {
		clienteService.cadastrarCliente(cli);
	}

}
