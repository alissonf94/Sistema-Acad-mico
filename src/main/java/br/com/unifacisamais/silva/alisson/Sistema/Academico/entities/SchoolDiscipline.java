package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import java.util.Set;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class SchoolDiscipline {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@OneToOne
	private User teacher;
	
	@ManyToMany
	private Set<User> students;
	
	public SchoolDiscipline () {}
	
	public SchoolDiscipline(String name, User teacher) {
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

	public void setTeacher(User teacher) {
		this.teacher = teacher;
	}

	public Set<User> getStudents() {
		return students;
	}

	public Long getId() {
		return id;
	}
	
}
