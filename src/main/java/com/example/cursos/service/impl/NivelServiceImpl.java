package com.example.cursos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cursos.dtos.NivelDto;
import com.example.cursos.enumerates.Nivel;
import com.example.cursos.service.NivelService;

@Service
public class NivelServiceImpl implements NivelService {

	@Override
	public List<NivelDto> getAllNivels() {
		Nivel[] niveles = Nivel.values();
		List<NivelDto> nivelesDto = new ArrayList<>();
		for(Nivel nivel: niveles) {
			nivelesDto.add(NivelDto.builder().nivel(nivel.getNivel()).build());
		}
		return nivelesDto;
	}

}
