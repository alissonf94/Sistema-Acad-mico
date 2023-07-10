package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import java.util.Set;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
class SchoolReport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToOne
	private Student student;
	
	@OneToMany(mappedBy = "schoolReport")
	private Set<Punctuation> scores;
	
	public SchoolReport() {}

	public SchoolReport(Set<Punctuation> scores) {
		this.scores = scores;
	}
	
	public Set<Punctuation> getScores() {
		return scores;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
