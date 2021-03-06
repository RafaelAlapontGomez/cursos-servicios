package com.example.cursos.jersey;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

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

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/{id}")
    public CursoDto getCurso(@PathParam("id") Integer id) {
        return cursoService.getCurso(id);
    }
    

//    @GET
//    @Path("/pagination")
//    @Produces("application/json")
//    public List<CursoDto> getAllCursosPagination(
//    		@RequestParam(required = false, name = "pageNumber") Integer pageNumber,
//    		@RequestParam(required = false, name = "pageSize")  Integer pageSize) {
//        return cursoService.getCursosPagination(pageNumber, pageSize);
//    }
    
    @POST
    @Consumes("application/json")
    public Response createUser(CursoDto cursoDto) throws URISyntaxException {
		CursoDto newCursoDto = cursoService.createCurso(cursoDto);
    	
    	URI uri = new URI("http://localhost:8080/curso/" + newCursoDto.getId());

   		return Response.status(Status.CREATED).contentLocation(uri).build();
    }
    

}
