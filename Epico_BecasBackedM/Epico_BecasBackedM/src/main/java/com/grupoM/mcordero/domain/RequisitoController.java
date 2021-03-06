package com.grupoM.mcordero.domain;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
//import java.util.TimeZone;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
//import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
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
	
	// @InitBinder
	  //  protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
	  //      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	  //      dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));/*Zona horaria zona horaria, resuelve el problema de la diferencia de 8 horas*/
	  //      binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	  //  }
	
	@InitBinder     
	public void initBinder(WebDataBinder binder){
	     binder.registerCustomEditor(       Date.class,     
	                         new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true, 10));   
	}

}
