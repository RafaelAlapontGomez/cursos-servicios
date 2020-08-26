package com.example.cursos.enumerates;

public enum Nivel {
	
	BASICO("Básico"),
	INTERMEDIO("Intermedio"),
	AVANZADO("Avanzado");
	
	private final String nivel;
	
	Nivel(String nivel) {
		this.nivel = nivel;
	}
    
	public static Nivel obtenerNivel(String nivelCurso) {
		Nivel[] niveles = Nivel.values();
		for(Nivel nivel: niveles) {
			if (nivel.getNivel().equals(nivelCurso)) {
				return nivel;
			}
		}
		return null;
	}
	
	public String obtenerNivel(Nivel nivelCurso) {
		Nivel[] niveles = Nivel.values();
		for(Nivel nivel: niveles) {
			if (nivel == nivelCurso) {
				return nivel.getNivel();
			}
		}
		return null;
	}
	
	public String getNivel() {
		return nivel;
	}
}
