package br.com.unifacisamais.silva.alisson.Sistema.Academico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.UserDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.UserMinDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Administrador;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Student;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.Teacher;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.User;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.enuns.UserRole;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	SchoolCardService cardService;
	
	public void registrer (UserDTO user) {
		try {
			String encryptedPassword = new BCryptPasswordEncoder().encode(user.getPassword());
			user.setPassword(encryptedPassword);
			
			if(user.getRole()== UserRole.STUDENT) {
				Student student = new Student(user.getName(), user.getEmail(), user.getBirthDate(),user.getPassword());
				userRepository.save(student);
			}
			
			else if (user.getRole()==UserRole.TEACHER){
				Teacher teacher = new Teacher (user.getName(),user.getEmail(), user.getBirthDate(),user.getPassword());
				userRepository.save(teacher);
			}
			
			else {
				Administrador administrador = new Administrador (user.getName(),user.getEmail(),user.getBirthDate(),user.getPassword(),UserRole.ADMIN);
				userRepository.save(administrador);
			}
		}
		catch (Exception exception) {
			System.err.print(exception.getMessage());
		}
	}
	
	
	public List<UserMinDTO> findAll() {
		List <User> users = userRepository.findAll();
		List <UserMinDTO> dto = users.stream().map(p -> new UserMinDTO (p)).toList();
		return dto;
	}
	
	public User findBYEmail (String email) {
		List<User> users = userRepository.findAll();
		User user = users.stream().filter(p -> p.getEmail().equals(email)).findAny().orElse(null);
		return user;
	}
}
