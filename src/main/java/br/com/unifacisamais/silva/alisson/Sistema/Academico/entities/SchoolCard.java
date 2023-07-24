package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class SchoolCard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	private Student student;
	
	@OneToMany
	private Set<Punctuation> scores;

	public SchoolCard(Long id ,Student student) {
		super();
		this.id = id;
		this.student = student;
	}
	
	public SchoolCard (){}

	public User getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Long getId() {
		return id;
	}

	public Set<Punctuation> getScores() {
		return scores;
	}
	
	
}
