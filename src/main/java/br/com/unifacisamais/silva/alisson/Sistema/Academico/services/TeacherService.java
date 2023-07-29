package br.com.unifacisamais.silva.alisson.Sistema.Academico.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.SchoolDiscipline;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Teacher;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.TeacherRepository;

@Service
public class TeacherService {
	
	@Autowired
	TeacherRepository repository;
	
	@Autowired
	UserService service;
	
	
}
