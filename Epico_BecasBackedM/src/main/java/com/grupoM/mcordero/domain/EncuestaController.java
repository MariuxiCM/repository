package com.grupoM.mcordero.domain;

import java.util.List;


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


import com.grupoM.mcordero.Entity.Encuesta;
import com.grupoM.mcordero.Repositories.IEncuestaRepository;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class EncuestaController {
	
	@Autowired
	IEncuestaRepository encuestaRepository;
	
	@GetMapping("/encuestas")
	public List<Encuesta> getAllencuestas() {
		return this.encuestaRepository.findAll();
	}

	@GetMapping("/encuestas/{id}")
	public ResponseEntity<Encuesta> getOne(@PathVariable(value = "id") Long id) {
		Encuesta encuesta = encuestaRepository.findById(id)
				.orElseThrow();
		return new ResponseEntity<>(encuesta, HttpStatus.OK);
	
	}

	@PostMapping("/encuesta")
	public Encuesta add(@RequestBody Encuesta encuesta) {
		return this.encuestaRepository.save(encuesta);
	}

	@PutMapping("/encuesta/{id}")
	public void update(Encuesta encuesta, @PathVariable(value = "id") long id) {
		encuestaRepository.save(encuesta);
	}

	@DeleteMapping("/encuesta/{id}")
	public ResponseEntity<HttpStatus> update(@PathVariable(value = "id") long id) {
		this.encuestaRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
