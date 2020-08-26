package com.example.cursos.jersey;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.example.cursos.dtos.ProfesorDto;
import com.example.cursos.service.ProfesorService;

@Service
@Path("/profesor")
public class ProfesorJersey {

	ProfesorService profesorService;
	
	public ProfesorJersey(ProfesorService profesorService) {
		this.profesorService = profesorService;
	}
	
    @GET
    @Produces("application/json")
    public List<ProfesorDto> getAllProfesores() {
        return profesorService.getAllProfesors();
    }
}
