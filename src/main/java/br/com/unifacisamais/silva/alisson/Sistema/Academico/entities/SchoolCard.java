package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
	
	@OneToMany( fetch = FetchType.EAGER)
	private List<Punctuation> scores =  new ArrayList<>();
	
	public SchoolCard (){}
		
	public SchoolCard(Student student) {
		this.student = student;
	}

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
