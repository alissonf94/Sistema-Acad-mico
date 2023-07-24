package br.com.unifacisamais.silva.alisson.Sistema.Academico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.UserMinDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.User;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	@Transactional(readOnly = true)
	public void insert (User user) {
		try {
			userRepository.save(user);
		}
		catch (Exception exception) {
			System.err.print(exception.getMessage());
		}
	}
	
	@Transactional(readOnly = true)
	public List<UserMinDTO> findAll() {
		List <User> users = userRepository.findAll();
		List <UserMinDTO> dto = users.stream().map(p -> new UserMinDTO (p)).toList();
		return dto;
	}
	
}
