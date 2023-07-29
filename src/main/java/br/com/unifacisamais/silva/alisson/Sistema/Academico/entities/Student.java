package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import java.util.Date;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.enuns.UserRole;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
@Entity
@PrimaryKeyJoinColumn(name = "id_student")
public class Student extends User {
	
	private static final long serialVersionUID = 1L;
	
	@OneToOne(mappedBy = "student",cascade = CascadeType.PERSIST)
	private SchoolCard schoolCard;
	
	public Student () {}
	
	public Student(String name, String email, Date birthDate, String password) {
		super(name, email, birthDate, password, UserRole.STUDENT);
		this.schoolCard = new  SchoolCard(this);
	}

	public SchoolCard getSchoolCard() {
		return schoolCard;
	}

	public void setSchoolCard(SchoolCard schoolCard) {
		this.schoolCard = schoolCard;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
