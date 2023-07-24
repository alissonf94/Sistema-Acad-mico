package br.com.unifacisamais.silva.alisson.Sistema.Academico.dto;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.SchoolDiscipline;

public class SchoolDisciplineDTO {
	private Long id;
	private String name;
	private String emailTeacher;
	
	public SchoolDisciplineDTO(SchoolDiscipline schoolDiscipline) {
		super();
		this.id = schoolDiscipline.getId();
		this.name = schoolDiscipline.getName();
		this.emailTeacher = schoolDiscipline.getTeacher().getEmail();
	}

	public String getEmailTeacher() {
		return emailTeacher;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
		
}
