package br.com.unifacisamais.silva.alisson.Sistema.Academico.dto;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Student;

public class StudentDTO {
	private Long id;
	private String name;
	private String email;
	
	public StudentDTO(Student student) {
		this.name = student.getName();
		this.email = student.getEmail();
		this.id = student.getId();
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}

	public Long getId() {
		return id;
	}
}
