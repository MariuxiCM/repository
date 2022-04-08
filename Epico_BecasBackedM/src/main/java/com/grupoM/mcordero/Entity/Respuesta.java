package com.grupoM.mcordero.Entity;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;

import javax.persistence.Table;





@Entity
@Table(name = "respuestas")
public class Respuesta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	
	
	@Enumerated( EnumType.STRING)
	@Column(name="tipo")
	private EnumTipo tipo;
	
	@Column(name="puntos")
	private int puntos;
	
	@Column(name="opcion")
	private String opcion;
	

	
	//@Column(name="id_pregunta")
	//	private int id_pregunta;
	
	 @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "pregunta_id", nullable = false)
	    private Pregunta pregunta;


public Respuesta() {
		
	}
	

public Respuesta(EnumTipo tipo, int puntos, String opcion, Pregunta pregunta) {
	super();
	this.tipo = tipo;
	this.puntos = puntos;
	this.opcion = opcion;
	//this.id_pregunta = id_pregunta;
}

	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public EnumTipo getTipo() {
		return tipo;
	}


	public void setTipo(EnumTipo tipo) {
		this.tipo = tipo;
	}


	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}


	public String getOpcion() {
		return opcion;
	}


	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}


	

	
	}
	
	 
	
	

