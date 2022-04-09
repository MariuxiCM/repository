package com.grupoM.mcordero.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoM.mcordero.Entity.Pregunta;
import com.grupoM.mcordero.Repositories.IPreguntaRepository;

@Service
public class PreguntaServicesImpl implements IPreguntaServices {
	
	//private final Logger LOGGER = LoggerFactory.getLogger(IPreguntaServices.class);

    @Autowired
	private IPreguntaRepository preguntaRepository;

    @Override
	public Pregunta get(long id) {
		return preguntaRepository.findById(id).get();
	}

	@Override
	public List<Pregunta> getAll() {
		return (List<Pregunta>) preguntaRepository.findAll();
	}

	@Override
	public void post(Pregunta pregunta) {
		preguntaRepository.save(pregunta);
		
	}

	@Override
	public void put(Pregunta pregunta, long id) {
		preguntaRepository.findById(id).ifPresent((x) -> {
			pregunta.setId(id);
			preguntaRepository.save(pregunta);
		});
	}

	@Override
	public void delete(long id) {
		preguntaRepository.deleteById(id);
		
	}
    /*@Override
	public List<Pregunta> todasPreguntas() {
    	 return preguntaRepository.todasPreguntas();
	}*/

	

	
}
