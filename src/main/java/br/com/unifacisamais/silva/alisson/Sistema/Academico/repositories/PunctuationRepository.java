package br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Punctuation;


public interface PunctuationRepository extends JpaRepository<Punctuation,Long>{
	@Query(nativeQuery = true, value = """
			SELECT * from punctuation where card_id = :cardId
				""")
	List<Punctuation> searchByCard(Long cardId);
}
