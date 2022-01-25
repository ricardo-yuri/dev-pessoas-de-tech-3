package com.piratariaprojetosweb.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piratariaprojetosweb.manager.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
