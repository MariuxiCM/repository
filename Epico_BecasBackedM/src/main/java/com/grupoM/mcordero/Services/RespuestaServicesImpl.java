package com.grupoM.mcordero.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoM.mcordero.Entity.Respuesta;
import com.grupoM.mcordero.Repositories.IRespuestaRepository;

@Service
public class RespuestaServicesImpl implements IRespuestaServices {

	@Autowired
	private IRespuestaRepository respuestaRepository;
	
	@Override
	public List<Respuesta> listaRespuesta() {
		return respuestaRepository.findAll();
	}

	
	
	
}
