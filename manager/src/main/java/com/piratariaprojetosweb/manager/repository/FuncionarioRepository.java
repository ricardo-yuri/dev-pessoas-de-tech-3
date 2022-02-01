package com.piratariaprojetosweb.manager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piratariaprojetosweb.manager.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	public Optional<Funcionario> findByUsername(String username);
}
