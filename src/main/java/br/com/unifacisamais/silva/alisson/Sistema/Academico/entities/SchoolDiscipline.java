package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class SchoolDiscipline {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@ManyToOne 
	private Teacher teacher;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Student> students = new HashSet<>();
	
	public SchoolDiscipline () {}
	
	public SchoolDiscipline(String name,Teacher teacher) {
		this.name = name;
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getTeacher() {
		return teacher;
	}


	public Set<Student> getStudents() {
		return students;
	}

	public Long getId() {
		return id;
	}
	
}
