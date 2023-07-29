package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;


import jakarta.persistence.Embeddable;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Embeddable
public class PunctuationPK {
	
	@OneToOne
	@JoinColumn(name = "discipline_id")
	private SchoolDiscipline disciplina;
	
	@ManyToOne
	@JoinColumn(name = "card_id")
	private SchoolCard schoolCard;
	
	public PunctuationPK() {}

	public SchoolDiscipline getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(SchoolDiscipline disciplina) {
		this.disciplina = disciplina;
	}

	public SchoolCard getSchoolCard() {
		return schoolCard;
	}

	public void setSchoolCard(SchoolCard schoolCard) {
		this.schoolCard = schoolCard;
	}
	
	
}