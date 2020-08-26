package com.example.cursos.jersey;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.example.cursos.dtos.NivelDto;
import com.example.cursos.service.NivelService;

@Service
@Path("/nivel")
public class NivelJersey {

	NivelService nivelService;
	
	public NivelJersey(NivelService nivelService) {
		this.nivelService = nivelService;
	}
	
    @GET
    @Produces("application/json")
    public List<NivelDto> getAllNiveles() {
        return nivelService.getAllNivels();
    }
}
