package com.grupoM.mcordero.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.data.annotation.Id;

import com.sun.istack.NotNull;

//import lombok.Data;

//@SuppressWarnings("serial")
//@Data

@Entity
@Table(name = "requisito")

public class Requisito implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	private String descripcion;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Requisito(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public Requisito() {
	}

}
