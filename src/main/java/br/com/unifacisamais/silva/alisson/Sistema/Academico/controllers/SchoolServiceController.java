package br.com.unifacisamais.silva.alisson.Sistema.Academico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.SchoolDisciplineDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.services.SchoolDisciplineService;

@RestController
@RequestMapping(value = "/disciplines")
public class SchoolServiceController {
	@Autowired
	SchoolDisciplineService service;
	
	@GetMapping
	public List<SchoolDisciplineDTO> findAll (){
		return service.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public SchoolDisciplineDTO findById (@PathVariable Long id ) {
		return service.findById(id);
		
	}
}
