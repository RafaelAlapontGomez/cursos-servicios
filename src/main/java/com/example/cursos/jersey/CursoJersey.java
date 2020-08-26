package com.example.cursos.jersey;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.example.cursos.dtos.CursoDto;
import com.example.cursos.service.CursoService;

@Service
@Path("/curso")
public class CursoJersey {

	CursoService cursoService;
	
	public CursoJersey(CursoService cursoService) {
		this.cursoService = cursoService;
	}
	
    @GET
    @Produces("application/json")
    public List<CursoDto> getAllCursos() {
        return cursoService.getCursos();
    }
    
    @POST
    @Consumes("application/json")
    public Response createUser(CursoDto cursoDto) throws URISyntaxException {
    	@SuppressWarnings("unused")
		int result = cursoService.createCurso(cursoDto);
    	URI uri = new URI("http://localhost:8080/curso/" );

   		return Response.status(201).contentLocation(uri).build();
    }
    

}
