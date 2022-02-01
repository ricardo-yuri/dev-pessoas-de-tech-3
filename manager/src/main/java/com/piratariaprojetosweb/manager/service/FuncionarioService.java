package com.piratariaprojetosweb.manager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.piratariaprojetosweb.manager.entity.Funcionario;
import com.piratariaprojetosweb.manager.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	private final FuncionarioRepository repository;
	private final PasswordEncoder encoder;

	public FuncionarioService(FuncionarioRepository repository, PasswordEncoder encoder) {
		this.repository = repository;
		this.encoder = encoder;
	}

	public List<Funcionario> findAll() {
		return repository.findAll();
	}

	public Funcionario createFuncionario(Funcionario funcionario) {
		try {
			funcionario.setPassword(encoder.encode(funcionario.getPassword()));
			return repository.save(funcionario);
		} catch (IllegalArgumentException e) {
			throw new UsernameNotFoundException("Usuario não pode ser nulo", e);
		}
	}

	public Optional<Funcionario> findByUsername(String username) {
		Optional<Funcionario> funcionario = repository.findByUsername(username);
		if (funcionario.isEmpty()) {
			throw new UsernameNotFoundException("Usuario não encontrado");
		}
		return funcionario;
	}
	
	public boolean validarPassword(String user, String password) {
		boolean valid = false;
		Optional<Funcionario> usuario = this.findByUsername(user);
		Funcionario funcionario = usuario.get();
		valid = encoder.matches(password, funcionario.getPassword());
		
		return valid;
		
	}

}
