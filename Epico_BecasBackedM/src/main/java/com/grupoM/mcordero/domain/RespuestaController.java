package com.grupoM.mcordero.domain;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupoM.mcordero.Entity.Respuesta;
import com.grupoM.mcordero.Repositories.IRespuestaRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class RespuestaController {
	
	private final IRespuestaRepository respuestaRepository;
	
	

	@Autowired
	public RespuestaController(IRespuestaRepository respuestaRepository) {
		this.respuestaRepository= respuestaRepository;
	}
	
	
	//LISTAR TODAS
				
		@GetMapping("/respuestas")
		public List<Respuesta> getPreguntas(){
			return this.respuestaRepository.findAll();
		}
				
	
	
	
	

}
