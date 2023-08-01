package br.com.unifacisamais.silva.alisson.Sistema.Academico.dto;



public class PunctuationMinDTO {
	private String emailStudent;
	private Integer grade;
	private String nameSchoolDiscipline;
	
	public PunctuationMinDTO(String emailStudent, Integer grade, String nameSchoolDiscipline) {
		this.emailStudent = emailStudent;
		this.grade = grade;
		this.nameSchoolDiscipline = nameSchoolDiscipline;
	}
	public String getEmailStudent() {
		return emailStudent;
	}

	public Integer getGrade() {
		return grade;
	}

	public String getNameSchoolDiscipline() {
		return nameSchoolDiscipline;
	}
	
	
}
