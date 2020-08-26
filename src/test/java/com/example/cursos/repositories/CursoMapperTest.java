package com.example.cursos.repositories;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.cursos.entities.Curso;

@SpringBootTest
public class CursoMapperTest {

    @Autowired
    private CursoMyBatisRepository repository;
    
    @Test
    public void findAllTest() {
    	List<Curso> cursos = repository.findAll();
    	assertNotNull(cursos);
    	assertTrue(cursos.size() == 3);
    }
    
    @Test
    public void findByActivoTest() {
    	List<Curso> cursos = repository.findByActivo(true);
    	assertNotNull(cursos);
    	assertTrue(cursos.size() == 2);
    }
    
    @Test
    public void createCursoTest() {
    	Curso newCurso = 
    		Curso.builder()
    			.id(10)
    			.numHoras(25)
    			.activo(true)
    			.profesorId(3)
    			.titulo("Spring boot")
    			.nivel("Basico")
    			.build();
    	
    	int response = repository.insert(newCurso);
    	assertNotNull(response);
    }
}
