package br.com.unifacisamais.silva.alisson.Sistema.Academico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.PunctuationDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.PunctuationMinDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.services.PunctuationService;
@RestController
@RequestMapping(value = "/punctuations")
public class PunctuationController {
	@Autowired
	PunctuationService punctuationService;
	
	@PostMapping
	public ResponseEntity<PunctuationMinDTO> assignStudentGrade (@RequestBody PunctuationMinDTO gradeStudentDTO){
		punctuationService.assignStudentGrade(gradeStudentDTO);
		return ResponseEntity.ok().body(gradeStudentDTO);
	}
	
	@GetMapping(value = "/{cardId}/list")
	public List<PunctuationDTO> findByCardId (@PathVariable Long cardId){
		List<PunctuationDTO> result = punctuationService.findByCard(cardId);
		return result;
	}
}
