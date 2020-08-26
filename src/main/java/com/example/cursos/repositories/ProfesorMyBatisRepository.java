package com.example.cursos.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.cursos.entities.Profesor;

@Mapper
public interface ProfesorMyBatisRepository {

	@Select("SELECT * FROM profesor WHERE id = #{id}")
	public Profesor findById(long id);
	
	@Select("SELECT * FROM profesor")
	public List<Profesor> findAll();
}
