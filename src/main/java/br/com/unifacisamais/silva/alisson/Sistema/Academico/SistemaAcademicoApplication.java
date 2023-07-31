package br.com.unifacisamais.silva.alisson.Sistema.Academico;





import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.UserDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.enuns.UserRole;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.PunctuationRepository;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.SchoolCardRerpository;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.SchoolDisciplineRepository;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.TeacherRepository;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.UserRepository;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.services.PunctuationService;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.services.SchoolCardService;
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
	@Autowired
	SchoolCardRerpository cardRerpository;
	
	@Autowired
	SchoolCardService cardService;
	@Autowired
	PunctuationRepository punctuationRepository;
	@Autowired
	PunctuationService punctuationService;
	
	public static void main(String[] args) {
		SpringApplication.run(SistemaAcademicoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		/*SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Teacher teacher = new Teacher ("Vera Lucia","veraLucia@gmail.com",formato.parse("21/10/1975"),"vera123");
		userService.insert(teacher);
		Student t = new Student ("alisson","alissonfernandes@gmail.com",formato.parse("19/09/2001"),"alisson123");
		userService.insert(t);*/
		
		//schoolDisciplineService.addStudent("alissonfernandes@gmail.com", "Gestão de processos");
		
		
		//schoolDisciplineService.insert("veraLucia@gmail.com","Gestão de processos");
		
		//punctuationService.assignStudentGrade("alissonfernandes@gmail.com",10,"Gestão de processos");
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		UserDTO t = new UserDTO ("Vera lucia","veraLucia@gmail.com",formato.parse("05/11/1970"),"alice123",UserRole.TEACHER);
		userService.insert(t);
		
	}

}
