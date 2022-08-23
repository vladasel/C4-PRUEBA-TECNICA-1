package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.Juego;



public interface IJuegoService {
	public List<Juego> listarJuegos(); // Listar All

	public Juego guardarJuego(Juego juego);

	public Juego juegoXID(Long id);

	public Juego actualizarJuego(Juego jeugo);

	public void eliminarJuego(Long id);
}
