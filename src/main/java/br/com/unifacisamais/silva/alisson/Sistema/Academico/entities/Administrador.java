package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.enuns.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id_admin")
public class Administrador extends User{


	private static final long serialVersionUID = 1L;
	
	public Administrador () {
	}
	
	public Administrador (String name, String email, Date birthDate, String password) {
		super(name,email,birthDate,password,UserRole.ADMIN);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return getPasswordUser();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
