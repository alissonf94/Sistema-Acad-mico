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
	
	@Autowired
	SchoolDisciplineService disciplineService;
	
	public void AddDiscipline (String Namediscipline, String emailTeacher) {
	try {
		Teacher teacher = (Teacher) service.findBYEmail(emailTeacher);
		if (teacher == null) {
			throw new Exception("profesor nn encontradado");
		}
		SchoolDiscipline discipline = new SchoolDiscipline(Namediscipline,teacher);
		disciplineService.insert(discipline);
		teacher.getSchooDisciplines().add(discipline);
		
	
	}
	catch (Exception e) {
		System.err.println(e.getMessage());
	}
	}
}
