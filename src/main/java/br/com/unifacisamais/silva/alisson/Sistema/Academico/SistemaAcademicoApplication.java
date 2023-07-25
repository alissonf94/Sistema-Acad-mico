package br.com.unifacisamais.silva.alisson.Sistema.Academico;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.SchoolDisciplineRepository;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.TeacherRepository;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.UserRepository;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.services.SchoolDisciplineService;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.services.TeacherService;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.services.UserService;

@SpringBootApplication
public class SistemaAcademicoApplication implements CommandLineRunner{
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserService userService;
	
	@Autowired
	SchoolDisciplineRepository disciplineRepository;
	
	@Autowired
	SchoolDisciplineService schoolDisciplineService; 
	
	@Autowired
	TeacherRepository repository;

	@Autowired
	TeacherService service;
	public static void main(String[] args) {
		SpringApplication.run(SistemaAcademicoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		service.AddDiscipline("matematica","Paulofertnanersxx55@gmail");
	}

}
