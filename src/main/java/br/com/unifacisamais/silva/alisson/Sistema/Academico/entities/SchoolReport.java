package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import java.util.Set;

class SchoolReport {
	private Set<Punctuation> scores;
	
	public SchoolReport(Set<Punctuation> scores) {
		this.scores = scores;
	}
	
	public Set<Punctuation> getScores() {
		return scores;
	}
}
