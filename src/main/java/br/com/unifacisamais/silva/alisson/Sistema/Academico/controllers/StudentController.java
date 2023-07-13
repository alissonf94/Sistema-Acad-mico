package br.com.unifacisamais.silva.alisson.Sistema.Academico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.StudentDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.services.StudentService;

@RestController
@RequestMapping(value = "students")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping(value = "/{id}")
	public StudentDTO findById (@PathVariable Long id) {
		StudentDTO studentDTO = studentService.findById(id);
		return studentDTO;
	}
	
	@GetMapping
	public List<StudentDTO> findAll (){
		return studentService.findAll();
	}
}
