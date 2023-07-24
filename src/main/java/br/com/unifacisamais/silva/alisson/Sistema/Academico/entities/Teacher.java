package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import java.util.Date;
import java.util.Set;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.enuns.UserRole;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("teacher")
@PrimaryKeyJoinColumn(name = "id")
public class Teacher extends User{
	private static final long serialVersionUID = 1L;
	
	@OneToMany
	@JoinTable(name = "teacher_has_disciplines", joinColumns = {@JoinColumn(name="teacher_id")}
	,inverseJoinColumns = {@JoinColumn(name="discipline_id")})
	private Set<SchoolDiscipline> schooDisciplines;
	
	public Teacher () {}
	
	public Teacher(String name, String email, Date birthDate, String password, UserRole role) {
		super(name, email, birthDate, password, role);
	}
	
	public Set<SchoolDiscipline> getSchooDisciplines() {
		return schooDisciplines;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
}
 