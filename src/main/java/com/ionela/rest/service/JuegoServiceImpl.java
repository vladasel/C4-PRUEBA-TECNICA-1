package com.ionela.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ionela.rest.dao.IJuegoDAO;
import com.ionela.rest.dto.Juego;

@Service
public class JuegoServiceImpl implements IJuegoService {

	@Autowired
	IJuegoDAO iJuegoDAO;

	@Override
	public List<Juego> listarJuegos() {
		return iJuegoDAO.findAll();
	}

	@Override
	public Juego guardarJuego(Juego juego) {
		return iJuegoDAO.save(juego);
	}

	@Override
	public Juego juegoXID(Long id) {
		return iJuegoDAO.findById(id).get();
	}

	@Override
	public Juego actualizarJuego(Juego juego) {
		return iJuegoDAO.save(juego);
	}

	@Override
	public void eliminarJuego(Long id) {
		iJuegoDAO.deleteById(id);
	}

}
