package com.grupoM.mcordero.Entity;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

//import org.springframework.data.annotation.Id;





@Entity
@Table(name = "cursos")
public class Curso implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String codigo;
	
	@NotNull //@NotEmpty
	private String nombre;
	
	@NotNull
	private String descripcion;
	
	
	private int numero_horas;
	
	
	private int id_profesor;
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getNumero_horas() {
		return numero_horas;
	}

	public void setNumero_horas(int numero_horas) {
		this.numero_horas = numero_horas;
	}

	public int getId_profesor() {
		return id_profesor;
	}

	public void setId_profesor(int id_profesor) {
		this.id_profesor = id_profesor;
	}
	
	

	

	public Curso(String codigo, String nombre, String descripcion, int numero_horas, int id_profesor) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.numero_horas = numero_horas;
		this.id_profesor = id_profesor;
	}

	public Curso() {
		
	}

	
	
	
	

	
	
}
