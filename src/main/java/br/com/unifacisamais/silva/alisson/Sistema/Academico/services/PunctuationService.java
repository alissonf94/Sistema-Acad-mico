package br.com.unifacisamais.silva.alisson.Sistema.Academico.services;

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
}
