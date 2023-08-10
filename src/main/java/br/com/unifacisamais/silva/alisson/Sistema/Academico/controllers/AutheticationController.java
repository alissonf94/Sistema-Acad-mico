package br.com.unifacisamais.silva.alisson.Sistema.Academico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.AutheticationDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.UserDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.services.UserService;

@RestController
@RequestMapping(value = "auth")
public class AutheticationController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	public ResponseEntity login (@RequestBody @Validated AutheticationDTO data) {
		var usernamePassword = new UsernamePasswordAuthenticationToken(data.getEmail(), data.getPassword());
		var auth = this.authenticationManager.authenticate(usernamePassword);
		return ResponseEntity.ok().build();
		
	}
	
	@PostMapping("/register")
	public ResponseEntity<UserDTO> insert( @RequestBody UserDTO body) {
		userService.registrer(body);
		return ResponseEntity.ok().body(body);
	}
	
}
