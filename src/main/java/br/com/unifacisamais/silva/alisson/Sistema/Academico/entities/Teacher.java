package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import java.util.Date;
import java.util.Set;

public class Teacher extends User{
	
	Set<SchoolDiscipline> schooDisciplines;
	public Teacher () {}
	
	public Teacher(String name, String email, Date birthDate, String password, Set<SchoolDiscipline> schoolDisciplines) {
		super(name, email, birthDate, password);
		this.schooDisciplines = schoolDisciplines;
	}
	
}
