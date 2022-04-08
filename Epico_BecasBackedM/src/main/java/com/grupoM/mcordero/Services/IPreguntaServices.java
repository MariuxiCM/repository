package com.grupoM.mcordero.Services;

import java.util.List;


import com.grupoM.mcordero.Entity.Pregunta;

public interface IPreguntaServices {
		//public List<Pregunta> todasPreguntas(); 
		
	public Pregunta get(long id);

	public List<Pregunta> getAll();

	public void post(Pregunta pregunta);

	public void put(Pregunta pregunta, long id);

	public void delete(long id);
}
