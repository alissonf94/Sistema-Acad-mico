package br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;



import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail (String email);
}
