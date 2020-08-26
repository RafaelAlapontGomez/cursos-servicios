package com.example.cursos.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.example.cursos.config.filers.CORSFilter;
import com.example.cursos.jersey.CursoJersey;
import com.example.cursos.jersey.NivelJersey;
import com.example.cursos.jersey.ProfesorJersey;

@Configuration
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig() {
		register(CursoJersey.class);
		register(ProfesorJersey.class);
		register(NivelJersey.class);
		register(CORSFilter.class);
	}
}
