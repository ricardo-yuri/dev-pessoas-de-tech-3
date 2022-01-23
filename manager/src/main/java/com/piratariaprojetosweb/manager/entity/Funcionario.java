package com.piratariaprojetosweb.manager.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity(name = "tb_funcionario")
public class Funcionario extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cargo; // TODO CRIAR ENUM CARGO

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
