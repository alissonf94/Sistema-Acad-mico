package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import java.util.Date;

public class Student extends User {
	private SchoolReport schoolReport;
	
	public Student () {}
	
	public Student(String name, String email, Date birthDate, String password) {
		super(name, email, birthDate, password);
		// TODO Auto-generated constructor stub
	}

	public SchoolReport getSchoolReport() {
		return schoolReport;
	}

	public void setSchoolReport(SchoolReport schoolReport) {
		this.schoolReport = schoolReport;
	}
	
}
