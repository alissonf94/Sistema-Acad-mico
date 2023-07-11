package br.com.unifacisamais.silva.alisson.Sistema.Academico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.UserMinDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public List<UserMinDTO> findAll (){
		List <UserMinDTO> result = userService.findAll();
		return result;
	}
}
