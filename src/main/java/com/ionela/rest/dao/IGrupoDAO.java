package com.ionela.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ionela.rest.dto.Grupo;

public interface IGrupoDAO extends JpaRepository<Grupo, Long> {
	Grupo findByJuego(String nombre_juego);
}
