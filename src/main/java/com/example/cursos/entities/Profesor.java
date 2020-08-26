package com.example.cursos.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Profesor {
	private Integer id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	public String buildStringProfesor() {
		StringBuilder profesorBuilder = new StringBuilder(getApellido1());
		if (getApellido2() != null && getApellido2().length() > 0) {
			profesorBuilder.append(" ").append(getApellido2());
		}
		profesorBuilder.append(", ").append(getNombre());
		
		return profesorBuilder.toString();
	}

}
