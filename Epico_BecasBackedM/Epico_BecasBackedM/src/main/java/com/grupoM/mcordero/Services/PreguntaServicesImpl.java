package com.grupoM.mcordero.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.grupoM.mcordero.Entity.Pregunta;
import com.grupoM.mcordero.Repositories.IPreguntaRepository;

public class PreguntaServicesImpl implements IPreguntaServices {
	
	//private final Logger LOGGER = LoggerFactory.getLogger(IPreguntaServices.class);

    @Autowired
	private IPreguntaRepository preguntaRepository;

    @Override
	public List<Pregunta> todasPreguntas() {
    	 return preguntaRepository.todasPreguntas();
	}

	
}
