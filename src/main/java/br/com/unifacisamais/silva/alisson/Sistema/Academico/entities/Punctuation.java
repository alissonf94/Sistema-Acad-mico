package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Punctuation {
	private int value;
	@EmbeddedId
	private PunctuationPK id =  new PunctuationPK();
	
	public Punctuation() {}

	public Punctuation(int value, SchoolDiscipline discipline, SchoolCard schoolCard) {
		this.value = value;
		id.setDisciplina(discipline);
		id.setSchoolCard(schoolCard);
	}

	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
}
