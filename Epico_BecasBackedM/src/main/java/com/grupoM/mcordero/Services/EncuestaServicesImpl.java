package com.grupoM.mcordero.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoM.mcordero.Entity.Encuesta;
import com.grupoM.mcordero.Repositories.IEncuestaRepository;


@Service
public class EncuestaServicesImpl implements IEncuestaServices {

	@Autowired
	private IEncuestaRepository encuestaRepository;
	
	
	@Override
	public List<Encuesta> findAll() {
		return encuestaRepository.findAll();
	}

	@Override
	public Encuesta findById(Integer id) {
		return encuestaRepository.findById(id).get();
	}

	@Override
	public void deleteById(Integer id) {
		encuestaRepository.deleteById(id);
		
	}

	@Override
	public Encuesta nuevaEncuesta(Encuesta encuesta) {
		return encuestaRepository.save(encuesta);
	}
	
	
	
	
	

}
