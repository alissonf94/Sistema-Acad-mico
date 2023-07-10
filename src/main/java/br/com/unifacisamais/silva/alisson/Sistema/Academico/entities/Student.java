package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
@Entity
@PrimaryKeyJoinColumn(name = "email")
@DiscriminatorValue("student")
public class Student extends User {
	
	private static final long serialVersionUID = 1L;
	@OneToOne(mappedBy = "student", fetch = FetchType.LAZY)
	private SchoolReport schoolReport;
	
	public Student () {}
	
	public Student(String name, String email, Date birthDate, String password) {
		super(name, email, birthDate, password);
	}

	public SchoolReport getSchoolReport() {
		return schoolReport;
	}

	public void setSchoolReport(SchoolReport schoolReport) {
		this.schoolReport = schoolReport;
	}
	
}
