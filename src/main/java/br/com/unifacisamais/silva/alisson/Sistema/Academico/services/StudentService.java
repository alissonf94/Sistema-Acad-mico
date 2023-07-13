package br.com.unifacisamais.silva.alisson.Sistema.Academico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.StudentDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Student;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repository;
	
	@Transactional(readOnly = true)
	public StudentDTO findById(Long id) {
		StudentDTO studentDTO = new StudentDTO (repository.findById(id).get());
		
		return studentDTO;
	}
	@Transactional(readOnly = true)
	public List<StudentDTO> findAll (){
		List<Student> students = repository.findAll();
		List<StudentDTO> result = students.stream().map(p -> new StudentDTO(p)).toList();
		
		return result;
	}
}
