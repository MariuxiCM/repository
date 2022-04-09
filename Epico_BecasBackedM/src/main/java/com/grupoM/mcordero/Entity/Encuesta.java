package com.grupoM.mcordero.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "encuestas")
public class Encuesta implements Serializable  {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private int  puntaje_maximo;
	
	private String  descripcion_general;
	
	  @ManyToMany(mappedBy = "encuestas")
	    List<Pregunta> preguntas;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPuntaje_maximo() {
		return puntaje_maximo;
	}

	public void setPuntaje_maximo(int puntaje_maximo) {
		this.puntaje_maximo = puntaje_maximo;
	}

	public String getDescripcion_general() {
		return descripcion_general;
	}

	public void setDescripcion_general(String descripcion_general) {
		this.descripcion_general = descripcion_general;
	}

	public Encuesta(int puntaje_maximo, String descripcion_general) {
		super();
		this.puntaje_maximo = puntaje_maximo;
		this.descripcion_general = descripcion_general;
	}

	public Encuesta() {
		
	}
	
	

}
