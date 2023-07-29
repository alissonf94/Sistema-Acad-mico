package br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Punctuation;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.PunctuationPK;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.SchoolDiscipline;

public interface PunctuationRepository extends JpaRepository<Punctuation,PunctuationPK>{
	
}
