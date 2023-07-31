package br.com.unifacisamais.silva.alisson.Sistema.Academico.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.GradeStudentDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Punctuation;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.PunctuationRepository;

@Service
public class PunctuationService {
	@Autowired
	PunctuationRepository punctuationRepository;
	
	public void insert (Punctuation punctuation) {
		punctuationRepository.save(punctuation);
	}
	public void assignStudentGrade (GradeStudentDTO gradeStudentDTO) {
		List <Punctuation> punctuations = punctuationRepository.findAll().stream().filter
				(p -> p.getNamediscipline().equals(gradeStudentDTO.getNameSchoolDiscipline())).collect(Collectors.toList());
		
		Punctuation punctuation = punctuations.stream().filter
				(p -> p.getCard().getStudent().getEmail().equals(gradeStudentDTO.getEmailStudent())).findAny().orElse(null);
		
		punctuation.setValue(gradeStudentDTO.getGrade());
		
		punctuationRepository.save(punctuation);
	}
}
