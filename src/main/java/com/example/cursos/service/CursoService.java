package com.example.cursos.service;

import java.util.List;

import com.example.cursos.dtos.CursoDto;

public interface CursoService {
	List<CursoDto> getCursos();
	int createCurso(CursoDto cursoDto);
//	List<CursoDto> getCursosPagination(Integer pageNumber, Integer pageSize);
}
