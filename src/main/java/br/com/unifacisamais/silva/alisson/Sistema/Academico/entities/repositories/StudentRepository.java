package br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
