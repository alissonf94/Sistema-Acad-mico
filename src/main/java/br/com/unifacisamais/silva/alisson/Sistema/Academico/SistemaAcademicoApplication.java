package br.com.unifacisamais.silva.alisson.Sistema.Academico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.PunctuationRepository;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.SchoolCardRerpository;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.SchoolDisciplineRepository;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.TeacherRepository;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.UserRepository;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.services.PunctuationService;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.services.SchoolCardService;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.services.SchoolDisciplineService;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.services.UserService;

@SpringBootApplication
public class SistemaAcademicoApplication {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserService userService;
	
	@Autowired
	SchoolDisciplineRepository disciplineRepository;
	
	@Autowired
	SchoolDisciplineService schoolDisciplineService; 
	
	@Autowired
	TeacherRepository repository;

	
	@Autowired
	SchoolCardRerpository cardRerpository;
	
	@Autowired
	SchoolCardService cardService;
	@Autowired
	PunctuationRepository punctuationRepository;
	@Autowired
	PunctuationService punctuationService;
	
	public static void main(String[] args) {
		SpringApplication.run(SistemaAcademicoApplication.class, args);
	}
	
}
