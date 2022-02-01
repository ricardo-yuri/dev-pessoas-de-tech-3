package com.piratariaprojetosweb.manager.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.piratariaprojetosweb.manager.data.UserDetailData;
import com.piratariaprojetosweb.manager.entity.Funcionario;
import com.piratariaprojetosweb.manager.repository.FuncionarioRepository;

@Component
public class UserDetailServiceImpl implements UserDetailsService {

	private final FuncionarioRepository repository;

	public UserDetailServiceImpl(FuncionarioRepository repository) {
		this.repository = repository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Funcionario> usuario = repository.findByUsername(username);
		if(usuario.isEmpty()) {
			throw new UsernameNotFoundException("Usuario [" + username + "] não encontrado");
		}
		return new UserDetailData(usuario);
	}

}
