package com.piratariaprojetosweb.manager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.piratariaprojetosweb.manager.entity.Funcionario;
import com.piratariaprojetosweb.manager.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	private final FuncionarioRepository repository;

	public FuncionarioService(FuncionarioRepository repository) {
		this.repository = repository;
	}
	
	public List<Funcionario> getAll() {
		return repository.findAll();
	}

}
