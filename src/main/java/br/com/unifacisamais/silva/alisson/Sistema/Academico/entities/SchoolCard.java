package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import java.util.ArrayList;
import java.util.List;
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
	private List<Punctuation> scores =  new ArrayList<>();

	public SchoolCard(Student student) {
		super();
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

	public List<Punctuation> getScores() {
		return scores;
	}
	
	
}
