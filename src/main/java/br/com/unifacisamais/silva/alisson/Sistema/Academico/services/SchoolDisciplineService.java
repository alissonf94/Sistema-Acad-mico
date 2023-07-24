package br.com.unifacisamais.silva.alisson.Sistema.Academico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unifacisamais.silva.alisson.Sistema.Academico.dto.SchoolDisciplineDTO;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.entities.SchoolDiscipline;
import br.com.unifacisamais.silva.alisson.Sistema.Academico.repositories.SchoolDisciplineRepository;
@Service
public class SchoolDisciplineService {
	@Autowired
	SchoolDisciplineRepository schoolDisciplineRepository;
	
	public void insert (SchoolDiscipline discipline) {
		schoolDisciplineRepository.save(discipline);
	}
	
	public List<SchoolDisciplineDTO> findAll(){
		List<SchoolDiscipline> disciplines = schoolDisciplineRepository.findAll();
		List <SchoolDisciplineDTO> result = disciplines.stream().map(p -> new SchoolDisciplineDTO(p)).toList();
		return result;
	}
	
	public SchoolDisciplineDTO findById (Long id) {
		return new SchoolDisciplineDTO(schoolDisciplineRepository.findById(id).get());
	}

}
