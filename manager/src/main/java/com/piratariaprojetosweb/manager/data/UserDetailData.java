package com.piratariaprojetosweb.manager.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.piratariaprojetosweb.manager.entity.Funcionario;

public class UserDetailData implements UserDetails {

	private static final long serialVersionUID = 1L;
	private final Optional<Funcionario> usuario;

	public UserDetailData(Optional<Funcionario> usuario) {
		this.usuario = usuario;

	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return new ArrayList<>();
	}

	@Override
	public String getPassword() {
		return usuario.orElse(new Funcionario()).getPassword();
	}

	@Override
	public String getUsername() {
		return usuario.orElse(new Funcionario()).getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
