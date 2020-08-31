package com.example.cursos.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.cursos.entities.Curso;

@Mapper
public interface CursoMyBatisRepository {

	@Select("SELECT * FROM curso WHERE id = #{id}")
	public Curso findById(long id);
	
	@Select("SELECT * FROM curso order by titulo")
	public List<Curso> findAll();

	@Select("SELECT * FROM curso WHERE activo = #{activo} order by upper(titulo)")
	public List<Curso> findByActivo(Boolean activo);
	
	@Insert("INSERT INTO curso(id, numHoras, titulo, nivel, profesorId, activo) VALUES (#{id}, #{numHoras}, #{titulo}, #{nivel}, #{profesorId}, #{activo})")
	public int insert(Curso curso);
}
