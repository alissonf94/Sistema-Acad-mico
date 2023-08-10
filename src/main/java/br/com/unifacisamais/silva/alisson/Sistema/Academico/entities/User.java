package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.enuns.UserRole;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User implements  UserDetails{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	private Date birthDate;
	private String password;
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private UserRole role;
	
	public User () {}
	
	public User(String name, String email, Date birthDate, String password, UserRole role) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.password = password;
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswordUser() {
		return password;
	}
	
}
