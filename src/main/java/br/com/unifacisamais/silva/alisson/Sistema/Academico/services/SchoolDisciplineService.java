package br.com.unifacisamais.silva.alisson.Sistema.Academico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.SchoolDisciplineDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Punctuation;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.SchoolCard;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.SchoolDiscipline;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Student;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Teacher;
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
	public void insert (String EmailTeacher, String nameDiscipline) {
		Teacher teacher =  (Teacher) service.findBYEmail(EmailTeacher);
		schoolDisciplineRepository.save(new SchoolDiscipline(nameDiscipline, teacher));
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
				 filter(p -> p.getName().equals(nameDiscipline)).findFirst().orElse(null);
		return discipline;
	}
	
	public void addStudent (String email,String nameDiscipline) {
		Student student = (Student) service.findBYEmail(email);
		SchoolCard card = cardService.findAll().stream().filter(p -> p.getStudent().getEmail().equals(student.getEmail())).findAny().orElse(null);
		SchoolDiscipline discipline= findByName(nameDiscipline);
		Punctuation punctuation = new Punctuation(discipline,card);
	
		
		punctuationService.insert(punctuation);
	}
}
