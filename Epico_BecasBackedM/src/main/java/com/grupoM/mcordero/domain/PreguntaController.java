package com.grupoM.mcordero.domain;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupoM.mcordero.Entity.Pregunta;
import com.grupoM.mcordero.Repositories.IPreguntaRepository;





@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class PreguntaController {
	
	private final IPreguntaRepository preguntaRepository;
	
	

	@Autowired
	public PreguntaController(IPreguntaRepository preguntaRepository) {
		this.preguntaRepository=preguntaRepository;
	}
	
	
	//LISTAR TODAS
				
		@GetMapping("/preguntas")
		public List<Pregunta> getAllcursos() {
			return this.preguntaRepository.findAll();
		}
				
	
	//listar
	@GetMapping("/preguntas/{id}")
	public ResponseEntity<Pregunta> getPreguntaById(@PathVariable("id") long id) {
		Optional<Pregunta> preguntaData = preguntaRepository.findById(id);
	
		if (preguntaData.isPresent()) {
			
			return new ResponseEntity<>(preguntaData.get(), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				}
		}	
	
	
	
	
	//AGREGAR pregunta
	@PostMapping("/preguntas")
	public Pregunta save(@RequestBody Pregunta pregunta) {
		System.out.println("pregunta: "+pregunta);
		return this.preguntaRepository.save(pregunta);
	}
	
	//ACTUALIZAR pregunta
	@PutMapping("/preguntas/{id}")
	public ResponseEntity<Pregunta> updatePregunta(@PathVariable("id") long id, @RequestBody Pregunta pregunta) {
		Optional<Pregunta> preguntaData = preguntaRepository.findById(id);
	    if (preguntaData.isPresent()) {
	      Pregunta _pregunta = preguntaData.get();
	      _pregunta.setEnunciado(pregunta.getEnunciado());
	      _pregunta.setTipo(pregunta.getTipo());
	      _pregunta.setSeccion(pregunta.getSeccion());
	      return new ResponseEntity<>(preguntaRepository.save(_pregunta), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	

	
	//ELIMINAR pregunta
	
	@DeleteMapping("/preguntas/{id}")
	public void delete(@PathVariable("id") long id) {

		if (preguntaRepository.existsById(id)) {
			preguntaRepository.deleteById(id);
		}
		//this.preguntaRepository.deleteById(id);
		
	}

	
	
	
		

	
}
