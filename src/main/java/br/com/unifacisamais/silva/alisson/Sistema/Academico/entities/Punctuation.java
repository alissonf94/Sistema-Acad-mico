package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Punctuation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int value;
	
	@OneToOne
	private SchoolDiscipline disciplina;
	@ManyToOne
	private SchoolReport schoolReport;

	public Punctuation() {}
	
	public Punctuation(int value, SchoolDiscipline disciplina) {
		this.value = value;
		this.disciplina = disciplina;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public SchoolDiscipline getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(SchoolDiscipline disciplina) {
		this.disciplina = disciplina;
	}

	public SchoolReport getSchoolReport() {
		return schoolReport;
	}

	public void setSchoolReport(SchoolReport schoolReport) {
		this.schoolReport = schoolReport;
	}
	 
}
