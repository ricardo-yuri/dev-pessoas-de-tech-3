package com.piratariaprojetosweb.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piratariaprojetosweb.manager.entity.Funcionario;
import com.piratariaprojetosweb.manager.service.FuncionarioService;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioController {

	@Autowired
	FuncionarioService service;
	
	List<Funcionario> getAll(){
		return service.getAll();
	}
}
