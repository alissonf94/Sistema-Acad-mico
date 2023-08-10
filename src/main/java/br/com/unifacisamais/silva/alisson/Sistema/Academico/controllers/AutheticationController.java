package br.com.unifacisamais.silva.alisson.Sistema.Academico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.AutheticationDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.LoginResponseDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.UserDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.User;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.security.TokenService;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.services.UserService;

@RestController
@RequestMapping("auth")
public class AutheticationController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private UserService userService;
	
	@Autowired
	private TokenService tokenService2;
	
	@PostMapping("/login")
	public ResponseEntity login (@RequestBody AutheticationDTO data) {
		UsernamePasswordAuthenticationToken usernamePassword = new UsernamePasswordAuthenticationToken(data.getEmail(), data.getPassword());
		
		var auth = this.authenticationManager.authenticate(usernamePassword);
		
		var token = tokenService2.generateToken((User) auth.getPrincipal());
		
		return ResponseEntity.ok(new LoginResponseDTO (token));
		
	}
	
	/*@PostMapping("/login")
	public String login(@RequestBody AutheticationDTO autheticationDTO) {
		UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = 
				new UsernamePasswordAuthenticationToken(autheticationDTO.getEmail(),autheticationDTO.getPassword());
		Authentication authenticate = this.authenticationManager.authenticate(usernamePasswordAuthenticationToken);
		User user = (User)  authenticate.getPrincipal();
	}*/
	
	@PostMapping("/register")
	public ResponseEntity<UserDTO> insert( @RequestBody UserDTO body) {
		userService.registrer(body);
		return ResponseEntity.ok().body(body);
	}
	
}
