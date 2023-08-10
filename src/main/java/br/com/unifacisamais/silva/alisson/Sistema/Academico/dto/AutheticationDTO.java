package br.com.unifacisamais.silva.alisson.Sistema.Academico.dto;



public class AutheticationDTO {
	private String email;
	private String password;

	
	public AutheticationDTO(String email, String password) {
		this.email = email;
		this.password = password;
		
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}

	
	
}
