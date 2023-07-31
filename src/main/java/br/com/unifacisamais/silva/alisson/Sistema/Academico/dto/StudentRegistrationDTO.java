package br.com.unifacisamais.silva.alisson.Sistema.Academico.dto;

public class StudentRegistrationDTO {
	private String emailStudent;
	private String nameDiscipline;
	
	
	public StudentRegistrationDTO(String emailStudent, String nameDiscipline) {
		this.emailStudent = emailStudent;
		this.nameDiscipline = nameDiscipline;
	}


	public String getEmailStudent() {
		return emailStudent;
	}


	public String getNameDiscipline() {
		return nameDiscipline;
	}

	
	
}
