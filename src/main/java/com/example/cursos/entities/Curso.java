package com.example.cursos.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Curso {

	private Integer id;
	private String titulo;
	private String nivel;
	private Integer numHoras;
	private Boolean activo;
	private Integer profesorId;
}
