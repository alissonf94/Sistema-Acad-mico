package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.enuns.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id_teacher")
public class Teacher extends User{
	private static final long serialVersionUID = 1L;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "teacher_has_disciplines", joinColumns = {@JoinColumn(name="teacher_id")}
	,inverseJoinColumns = {@JoinColumn(name="discipline_id")})
	private Set<SchoolDiscipline>schooDisciplines = new HashSet<>();
	
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
 