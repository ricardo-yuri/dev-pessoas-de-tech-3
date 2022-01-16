package com.piratariaprojetosweb.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piratariaprojetosweb.manager.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
