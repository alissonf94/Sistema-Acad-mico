package br.com.unifacisamais.silva.alisson.Sistema.Academico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.SchoolDisciplineDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Punctuation;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.SchoolCard;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.SchoolDiscipline;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Student;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.SchoolDisciplineRepository;
@Service
public class SchoolDisciplineService {
	@Autowired
	SchoolDisciplineRepository schoolDisciplineRepository;
	
	@Autowired
	UserService service;	
	public void insert (SchoolDiscipline discipline) {
		schoolDisciplineRepository.save(discipline);
	}
	
	public List<SchoolDisciplineDTO> findAll(){
		List<SchoolDiscipline> disciplines = schoolDisciplineRepository.findAll();
		List <SchoolDisciplineDTO> result = disciplines.stream().map(p -> new SchoolDisciplineDTO(p)).toList();
		return result;
	}
	
	public SchoolDisciplineDTO findById (Long id) {
		return new SchoolDisciplineDTO(schoolDisciplineRepository.findById(id).get());
	}
	
	public SchoolDiscipline findByName (String nameDiscipline) {
		List <SchoolDiscipline> disciplines = schoolDisciplineRepository.findAll();
		SchoolDiscipline discipline =  disciplines.stream().
				 filter(p -> p.getName()==nameDiscipline).findFirst().orElse(null);
		return discipline;
	}

	public void AddStudent (String nameDiscipline, String emailStudent,int value) {
		Student student = (Student)service.findBYEmail(emailStudent);
		
		SchoolDiscipline discipline = 	findByName(nameDiscipline);
		
		discipline.getStudents().add(student);
		
		student.setSchoolCard(new SchoolCard(student));
		
		student.getSchoolCard().getScores().add(new Punctuation(value, discipline, student.getSchoolCard()));
	}
}
