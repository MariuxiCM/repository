package com.grupoM.mcordero.Entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

@Entity
@Table(name = "encuestas_preguntas")
public class Encuesta_Pregunta {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@JsonIgnore
	@JoinColumn(name="id")
	@NotNull
	private int pregunta_id ;
	
	@JsonIgnore
	@JoinColumn(name="id")
	@NotNull
	private int encuesta_id;
	
	
		
		
		
	
}
