package com.grupoM.mcordero.Entity;

import java.io.Serializable;
import java.util.HashSet;
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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@Column(name="id_pregunta")
	private int id_pregunta;
	
	
	// @ManyToMany(mappedBy = "RespuestaTaken")
	 //   private Set<Respuesta> respuestaAttending  = new HashSet<>();
	 
	 @ManyToMany(fetch=FetchType.LAZY,cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	    @JoinTable(name="encuestas_preguntas",joinColumns=@JoinColumn(name="respuesta_id"),inverseJoinColumns=@JoinColumn(name="pregunta_id"))
	    private Set<Respuesta> respuestaAttending  = new HashSet<>();

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

	public int getId_pregunta() {
		return id_pregunta;
	}

	public void setId_pregunta(int id_pregunta) {
		this.id_pregunta = id_pregunta;
	}

	public Set<Respuesta> getRespuestaAttending() {
		return respuestaAttending;
	}

	public void setRespuestaAttending(Set<Respuesta> respuestaAttending) {
		this.respuestaAttending = respuestaAttending;
	}

	public Respuesta(EnumTipo tipo, int puntos, String opcion, int id_pregunta, Set<Respuesta> respuestaAttending) {
		super();
		this.tipo = tipo;
		this.puntos = puntos;
		this.opcion = opcion;
		this.id_pregunta = id_pregunta;
		this.respuestaAttending = respuestaAttending;
	}

	public Respuesta() {
		
	}
	
	
	@Override
    public String toString() {
        return "Respuesta [id=" + id + ", tipo=" + tipo + ", puntos=" + puntos + "]";
    }   
  
}
	 
	 
	
	

