package br.com.unifacisamais.silva.alisson.Sistema.Academico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.SchoolDisciplineDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.StudentRegistrationDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.services.SchoolDisciplineService;

@RestController
@RequestMapping(value = "/disciplines")
public class SchoolDisciplineController {
	@Autowired
	SchoolDisciplineService service;
	
	@GetMapping
	public List<SchoolDisciplineDTO> findAll (){
		return service.findAll();
	}
	@PostMapping
	public ResponseEntity<SchoolDisciplineDTO> insert(@RequestBody SchoolDisciplineDTO schoolDisciplineDTO ){
		service.insert(schoolDisciplineDTO);
		return ResponseEntity.ok().body(schoolDisciplineDTO);
	}
	@GetMapping(value = "/{id}")
	public SchoolDisciplineDTO findById (@PathVariable Long id ) {
		return service.findById(id);
		
	}
	
	@PostMapping(value = "/registracion")
	public ResponseEntity<StudentRegistrationDTO> enrollStudent (@RequestBody StudentRegistrationDTO studentRegistrationDTO){
		service.enrollStudent(studentRegistrationDTO);
		return ResponseEntity.ok().body(studentRegistrationDTO);
	}
}
