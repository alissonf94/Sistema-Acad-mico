package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities;

import java.util.Date;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.enuns.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id_admin")
public class Administrador extends User{


	private static final long serialVersionUID = 1L;
	
	public Administrador () {
	}
	
	public Administrador (String name, String email, Date birthDate, String password, UserRole role) {
		super(name,email,birthDate,password,role);
	}
	

}
