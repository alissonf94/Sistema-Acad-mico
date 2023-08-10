package br.com.unifacisamais.silva.alisson.Sistema.Academico.dto;

import java.util.Date;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.enuns.UserRole;

public class UserDTO {
	private String name;
	private String email;
	private Date birthDate;
	private String password;
	private UserRole role;
	
	public UserDTO(String name, String email, Date birthDate, String password, UserRole role) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.password = password;
		this.role = role;
	}


	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public String getPassword() {
		return password;
	}

	public UserRole getRole() {
		return role;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
