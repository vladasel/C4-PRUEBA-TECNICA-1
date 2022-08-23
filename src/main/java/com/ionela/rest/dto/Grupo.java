package com.ionela.rest.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "grupos")
public class Grupo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String nombre;
	
	@ManyToMany
	@JoinColumn(name = "usuarios")
	private List<Usuario> usuarios;
	
	@ManyToOne
	@JoinColumn(name = "juego")
	private Juego juego;
	
	@ManyToMany
	@JoinColumn(name = "mensajes")
	private List <Mensaje> mensajes;
	
	
	

}
