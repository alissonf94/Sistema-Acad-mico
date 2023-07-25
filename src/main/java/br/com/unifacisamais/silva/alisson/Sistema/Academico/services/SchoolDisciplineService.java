package br.com.unifacisamais.silva.alisson.Sistema.Academico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.SchoolDisciplineDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Punctuation;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.SchoolDiscipline;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Student;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.SchoolDisciplineRepository;
@Service
public class SchoolDisciplineService {
	@Autowired
	SchoolDisciplineRepository schoolDisciplineRepository;
	@Autowired
	SchoolCardService cardService;
	@Autowired
	PunctuationService punctuationService;
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
	
	public void addStudent (String email,String nameDiscipline) {
		Student student = (Student) service.findBYEmail(email);
		SchoolDiscipline discipline= findByName(nameDiscipline);
		discipline.getStudents().add(student);
		
		Punctuation punctuation = new Punctuation(discipline,student.getSchoolCard());
		student.getSchoolCard().getScores().add(punctuation);
		
		punctuationService.insert(punctuation);
	}
}
