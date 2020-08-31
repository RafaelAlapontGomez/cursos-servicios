package com.example.cursos.service;

import java.util.List;

import com.example.cursos.dtos.CursoDto;

public interface CursoService {
	List<CursoDto> getCursos();
	CursoDto createCurso(CursoDto cursoDto);
//	List<CursoDto> getCursosPagination(Integer pageNumber, Integer pageSize);
	CursoDto getCurso(Integer id);
}
