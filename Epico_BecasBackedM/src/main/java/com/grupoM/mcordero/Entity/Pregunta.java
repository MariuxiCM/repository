package com.grupoM.mcordero.Entity;

import java.io.Serializable;
//import java.util.Date;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "preguntas")
public class Pregunta implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	
	
	@Column(name = "enunciado")
	private String enunciado;
	
	@Column(name = "tipo")
	@Enumerated( EnumType.STRING)
	private EnumTipo tipo;
	
	@Enumerated( EnumType.STRING)
	@Column(name = "seccion")
	private EnumSeccion seccion;
	
	
	@OneToMany(mappedBy = "pregunta", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Respuesta> respuestas;
	
	
	public Pregunta() {
		
	}
	

	public Pregunta(String enunciado, EnumTipo tipo, EnumSeccion seccion) {
		super();
		this.enunciado = enunciado;
		this.tipo = tipo;
		this.seccion = seccion;
	}

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public EnumTipo getTipo() {
		return tipo;
	}

	public void setTipo(EnumTipo tipo) {
		this.tipo = tipo;
	}

	public EnumSeccion getSeccion() {
		return seccion;
	}

	public void setSeccion(EnumSeccion seccion) {
		this.seccion = seccion;
	}
	
	
	

	

}
