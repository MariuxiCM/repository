package com.grupoM.mcordero.Services;

import java.util.List;

import com.grupoM.mcordero.Entity.Encuesta;


public interface IEncuestaServices {
	
	  public List<Encuesta> findAll();

	    public Encuesta findById(Integer id);

	    public void deleteById(Integer id);

	    public Encuesta nuevaEncuesta(Encuesta encuesta);

		
	   
	    
	  

}
