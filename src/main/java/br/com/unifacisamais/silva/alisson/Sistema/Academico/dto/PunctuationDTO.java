package br.com.unifacisamais.silva.alisson.Sistema.Academico.dto;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Punctuation;


public class PunctuationDTO {
	private String nameDiscipline;
	private int grade;
	
	public PunctuationDTO (Punctuation punctuation) {
		this.nameDiscipline = punctuation.getNamediscipline();
		this.grade = punctuation.getValue();
		
	}

	public String getNameDiscipline() {
		return nameDiscipline;
	}

	public int getGrade() {
		return grade;
	}
	
}
