package br.com.unifacisamais.silva.alisson.Sistema.Academico;

import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.UserRepository;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.services.UserService;

@SpringBootApplication
public class SistemaAcademicoApplication implements CommandLineRunner{
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(SistemaAcademicoApplication.class, args);
	}

	public void run(String... args) throws Exception {
		//SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		/*Student student = new Student("Alisson fernandes","alissonfertnanersxx55@gmail"
				,formato.parse("19/09/2001"),"alisson1234");
		
		userService.insert(student);
		
		Teacher teacher = new Teacher("Diego", "diego@maisunifacisa.com.br",formato.parse("10/03/1885"),"diego1234");
		userService.insert(teacher);*/
	}
	

}
