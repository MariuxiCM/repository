package com.grupoM.mcordero.Entity;

import java.io.Serializable;
//import java.util.Date;
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


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
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
	
	


	@ManyToMany(fetch=FetchType.LAZY,cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	  @JoinTable(name="encuestas_preguntas",joinColumns=@JoinColumn(name="pregunta_id"),inverseJoinColumns=@JoinColumn(name="encuesta_id"))
	private Set<Respuesta> respuestaTaken = new HashSet<>();
	
	   


	public Pregunta(String enunciado, EnumTipo tipo, EnumSeccion seccion, Set<Respuesta> respuestaTaken) {
		super();
		this.enunciado = enunciado;
		this.tipo = tipo;
		this.seccion = seccion;
		this.respuestaTaken = respuestaTaken;
	}
	
    public Pregunta() {
    }
    
  	//repuesta
	public Set<Respuesta> getRespuestaTaken() {
        return respuestaTaken;
    }

    public void setRespuestaTaken(Set<Respuesta> RespuestaTaken) {
        this.respuestaTaken = RespuestaTaken;
    }
    
  
	public void removeRespuesta(Respuesta tempRespuesta) {
    	respuestaTaken.remove(tempRespuesta);
    	tempRespuesta.getRespuestaAttending().remove(this);
    	
    	
    }

   /*
    @Override
    public String toString() {
        return "Pregunta [id=" + id + ", enunciado=" + enunciado + ", tipo=" + tipo + ", respuestaTaken="
                + respuestaTaken + "]";
    } 
    */     
	
	
	

 
	






	


	
	
	

}
