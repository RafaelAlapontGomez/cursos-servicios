package com.example.cursos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cursos.dtos.CursoDto;
import com.example.cursos.entities.Curso;
import com.example.cursos.entities.Profesor;
import com.example.cursos.repositories.CursoMyBatisRepository;
import com.example.cursos.repositories.ProfesorMyBatisRepository;
import com.example.cursos.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService {
	
	CursoMyBatisRepository cursoMyBatisRepository;
	ProfesorMyBatisRepository profesorMyBatisRepository;
	
	public CursoServiceImpl(CursoMyBatisRepository cursoMyBatisRepository, ProfesorMyBatisRepository profesorMyBatisRepository) {
		this.cursoMyBatisRepository = cursoMyBatisRepository;
		this.profesorMyBatisRepository = profesorMyBatisRepository;
	}

	public List<CursoDto> getCursos() {
		List<Curso> cursos = cursoMyBatisRepository.findByActivo(true);
		List<CursoDto> cursosDto = new ArrayList<>();
		for(Curso curso: cursos) {
			cursosDto.add(mapperCursoToCursoDto(curso));
		}
		return cursosDto;
	}

	public int createCurso(CursoDto cursoDto) {
		int result = cursoMyBatisRepository.insert(mapperCursoDtoToCurso(cursoDto));
		return result;
	}

//	@Override
//	public List<CursoDto> getCursosPagination(Integer pageNumber, Integer pageSize) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	

	private CursoDto mapperCursoToCursoDto(Curso curso) {
		Profesor profesor = profesorMyBatisRepository.findById(curso.getProfesorId());
		
		return CursoDto.builder()
				.id(curso.getId())
				.nivel(curso.getNivel())
				.numHoras(curso.getNumHoras())
				.profesorId(curso.getProfesorId())
				.profesor(profesor.buildStringProfesor())
				.titulo(curso.getTitulo())
				.activo(curso.getActivo())
				.build();
	}
	
	private Curso mapperCursoDtoToCurso(CursoDto cursoDto) {
		return Curso.builder()
				.id(cursoDto.getId())
				.activo(cursoDto.getActivo())
				.nivel(cursoDto.getNivel())
				.numHoras(cursoDto.getNumHoras())
				.profesorId(cursoDto.getProfesorId())
				.titulo(cursoDto.getTitulo())
				.build();
	}


}
