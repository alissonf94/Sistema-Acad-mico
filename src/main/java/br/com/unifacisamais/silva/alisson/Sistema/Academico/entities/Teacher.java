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
	
	@OneToMany(mappedBy = "teacher")
	private Set<SchoolDiscipline>schooDisciplines = new HashSet<>();
	
	public Teacher () {}
	
	public Teacher(String name, String email, Date birthDate, String password) {
		super(name, email, birthDate, password, UserRole.TEACHER);
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
 