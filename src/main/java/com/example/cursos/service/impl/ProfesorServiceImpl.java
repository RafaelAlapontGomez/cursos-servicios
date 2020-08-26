package com.example.cursos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cursos.dtos.ProfesorDto;
import com.example.cursos.entities.Profesor;
import com.example.cursos.repositories.ProfesorMyBatisRepository;
import com.example.cursos.service.ProfesorService;

@Service
public class ProfesorServiceImpl implements ProfesorService {

	ProfesorMyBatisRepository profesorMyBatisRepository;
	
	public ProfesorServiceImpl(ProfesorMyBatisRepository profesorMyBatisRepository) {
		this.profesorMyBatisRepository = profesorMyBatisRepository;
	}
	
	@Override
	public List<ProfesorDto> getAllProfesors() {
		List<Profesor> profesores = profesorMyBatisRepository.findAll();
		List<ProfesorDto> profesoresDto = new ArrayList<>();
		for(Profesor profesor: profesores) {
			profesoresDto.add(ProfesorDto.builder().id(profesor.getId()).profesor(profesor.buildStringProfesor()).build());
		}
		return profesoresDto;
	}

}
