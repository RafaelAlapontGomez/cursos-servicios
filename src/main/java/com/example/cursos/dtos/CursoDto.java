package com.example.cursos.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class CursoDto {

	private Integer id;
	private String titulo;
	private String nivel;
	private Integer numHoras;
	private Integer profesorId;
	private String profesor;
	private Boolean activo;
}
