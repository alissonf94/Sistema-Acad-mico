package br.com.unifacisamais.silva.alisson.Sistema.Academico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Punctuation;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.SchoolCard;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.SchoolCardRerpository;

@Service
public class SchoolCardService {
	@Autowired
	SchoolCardRerpository cardRerpository;
	
	public void insert (SchoolCard card) {
		cardRerpository.save(card);
	}
	
	
	public List<SchoolCard> findAll (){
		return cardRerpository.findAll();
	}
}
