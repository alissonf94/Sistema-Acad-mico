package br.com.unifacisamais.silva.alisson.Sistema.Academico.dto;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.User;

public class UserMinDTO {
	private Long id;
	private String name;
	private String email;
	
	public UserMinDTO(User user) {
		this.id =  user.getId();
		this.name = user.getName();
		this.email = user.getEmail();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
}
