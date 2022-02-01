package com.piratariaprojetosweb.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.piratariaprojetosweb.manager.entity.Funcionario;
import com.piratariaprojetosweb.manager.service.FuncionarioService;

@RestController
@RequestMapping(value = "/funcionario")
public class FuncionarioController {

	@Autowired
	FuncionarioService service;

	@GetMapping("/list")
	ResponseEntity<List<Funcionario>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@PostMapping("/salvar")
	ResponseEntity<Funcionario> createFuncionario(@RequestBody Funcionario funcionario) {
		return ResponseEntity.ok(service.createFuncionario(funcionario));
	}
	
	@PostMapping("/validar")
	ResponseEntity<Boolean> validarSenha(@RequestParam String username, @RequestParam String password){
		boolean valid = false;
		valid = service.validarPassword(username, password);
		return ResponseEntity.ok(valid);
	}
}
