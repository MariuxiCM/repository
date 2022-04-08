package com.grupoM.mcordero.Services;

import java.util.List;

import com.grupoM.mcordero.Entity.Curso;

public interface ICursoServices {
	
	public Curso get(long id);

	public List<Curso> getAll();

	public void post(Curso curso);

	public void put(Curso curso, long id);

	public void delete(long id);

}
