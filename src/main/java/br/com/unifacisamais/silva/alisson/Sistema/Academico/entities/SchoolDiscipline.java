package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import java.util.Set;

public class SchoolDiscipline {
	
	private String name;
	private Teacher teacher;
	private Set<Student> students;
	
	public SchoolDiscipline () {}
	
	public SchoolDiscipline(String name, Teacher teacher, Set<Student> students) {
		this.name = name;
		this.teacher = teacher;
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Set<Student> getStudents() {
		return students;
	}
}
