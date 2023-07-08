package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

public class Punctuation {
	private int value;
	private SchoolDiscipline disciplina;

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
	
	
}
