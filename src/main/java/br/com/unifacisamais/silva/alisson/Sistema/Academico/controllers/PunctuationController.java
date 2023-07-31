package br.com.unifacisamais.silva.alisson.Sistema.Academico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.GradeStudentDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.services.PunctuationService;
@RestController
@RequestMapping(value = "/punctuations")
public class PunctuationController {
	@Autowired
	PunctuationService punctuationService;
	
	@PostMapping
	public ResponseEntity<GradeStudentDTO> assignStudentGrade (@RequestBody GradeStudentDTO gradeStudentDTO){
		punctuationService.assignStudentGrade(gradeStudentDTO);
		return ResponseEntity.ok().body(gradeStudentDTO);
	}
}
