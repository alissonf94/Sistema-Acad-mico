package br.com.unifacisamais.silva.alisson.Sistema.Academico.enuns;

public enum UserRole {
	TEACHER("teacher"),
	STUDENT("Student"),
	ADMIN("administrator");
	private String role;
	
	UserRole (String role){
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	
	
	
}
