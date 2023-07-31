package br.com.unifacisamais.silva.alisson.Sistema.Academico.dto;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.SchoolDiscipline;

public class SchoolDisciplineDTO {
	private String nameDiscipline;
	private String emailTeacher;
	
	public SchoolDisciplineDTO(SchoolDiscipline schoolDiscipline) {
		this.nameDiscipline = schoolDiscipline.getName();
		this.emailTeacher = schoolDiscipline.getTeacher().getEmail();
	}
	
	public SchoolDisciplineDTO(String nameDiscipline, String emailTeacher) {
		this.nameDiscipline = nameDiscipline;
		this.emailTeacher = emailTeacher;
	}
	public String getEmailTeacher() {
		return emailTeacher;
	}


	public String getNameDiscipline() {
		return nameDiscipline;
	}

	
		
}
