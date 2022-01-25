package com.piratariaprojetosweb.manager.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity(name = "tb_funcionario")
public class Funcionario extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cargo;

	private String foto;

	private BigDecimal salario;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

}
