package br.com.unifacisamais.silva.alisson.Sistema.Academico.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Punctuation;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.PunctuationRepository;

@Service
public class PunctuationService {
	@Autowired
	PunctuationRepository punctuationRepository;
	
	public void insert (Punctuation punctuation) {
		punctuationRepository.save(punctuation);
	}
	public void assignStudentGrade (String emailStudent, Integer grade,String nameSchoolDisipline) {
		List <Punctuation> punctuations = punctuationRepository.findAll().stream().filter
				(p -> p.getId().getDisciplina().getName().equals(nameSchoolDisipline)).collect(Collectors.toList());
		Punctuation punctuation = punctuations.stream().filter
				(p -> p.getId().getSchoolCard().getStudent().getEmail().equals(emailStudent)).findAny().orElse(null);
		punctuation.setValue(grade);
		punctuationRepository.save(punctuation);
	}
}
