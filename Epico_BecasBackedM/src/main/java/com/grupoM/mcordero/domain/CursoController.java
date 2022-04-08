package com.grupoM.mcordero.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupoM.mcordero.Entity.Curso;
import com.grupoM.mcordero.Services.ICursoServices;


@RestController
public class CursoController {
	
	@Autowired
	ICursoServices cursoServices;
	
	@GetMapping("/curso")
	public List<Curso> getAllcursos() {
		return cursoServices.getAll();
	}

	@GetMapping("/curso/{id}")
	public Curso getOne(@PathVariable(value = "id") long id) {
		return cursoServices.get(id);
	}

	@PostMapping("/curso")
	public void add(Curso curso) {
		cursoServices.post(curso);
	}

	@PutMapping("/curso/{id}")
	public void update(Curso curso,@PathVariable(value = "id") long id) {
		cursoServices.put(curso, id);
	}
	
	@DeleteMapping("/curso/{id}")
	public void update(@PathVariable(value = "id") long id) {
		cursoServices.delete(id);
	}
	

}
