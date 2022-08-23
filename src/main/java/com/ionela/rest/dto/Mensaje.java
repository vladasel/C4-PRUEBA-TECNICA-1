package com.ionela.rest.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Mensaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String nombre;
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "mensajes")
	private List<Grupo> grupos;

	public Mensaje(long id, String nombre, List<Grupo> grupos) {
		this.id = id;
		this.nombre = nombre;
		this.grupos = grupos;
	}

	public Mensaje() {
	}

	public long getId() {
		return id;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "Grupo")
	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	@Override
	public String toString() {
		return "Mensaje [id=" + id + ", nombre=" + nombre + ", grupos=" + grupos + "]";
	}
	
	
}
