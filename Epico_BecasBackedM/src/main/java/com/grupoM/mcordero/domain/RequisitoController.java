package com.grupoM.mcordero.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupoM.mcordero.Entity.Requisito;
import com.grupoM.mcordero.Services.IRequisitoServices;

@RestController
public class RequisitoController {

	@Autowired
	IRequisitoServices requisitoServices;

	@GetMapping("/requisito")
	public List<Requisito> getAllRequisitos() {
		return requisitoServices.getAll();
	}

	@GetMapping("/requisito/{id}")
	public Requisito getOne(@PathVariable(value = "id") long id) {
		return requisitoServices.get(id);
	}

	@PostMapping("/requisito")
	public void add(Requisito requisito) {
		requisitoServices.post(requisito);
	}

	@PutMapping("/requisito/{id}")
	public void update(Requisito requisito,@PathVariable(value = "id") long id) {
		requisitoServices.put(requisito, id);
	}
	
	@DeleteMapping("/requisito/{id}")
	public void update(@PathVariable(value = "id") long id) {
		requisitoServices.delete(id);
	}

}
