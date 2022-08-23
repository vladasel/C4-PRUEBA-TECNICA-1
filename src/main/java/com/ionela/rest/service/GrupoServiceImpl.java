package com.ionela.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ionela.rest.dao.IGrupoDAO;
import com.ionela.rest.dto.Grupo;

@Service
public class GrupoServiceImpl implements IGrupoService {

	@Autowired
	IGrupoDAO iGrupoDAO;

	@Override
	public List<Grupo> listarGrupos() {

		return iGrupoDAO.findAll();
	}

	@Override
	public Grupo guardarGrupo(Grupo grupo) {
		return iGrupoDAO.save(grupo);
	}

	@Override
	public Grupo grupoXID(Long id) {
		return iGrupoDAO.findById(id).get();
	}

	public Grupo grupoXJuego(String nombre_juego) {
		return iGrupoDAO.findByJuego(nombre_juego);
	}

	@Override
	public Grupo actualizarGrupo(Grupo grupo) {
		return iGrupoDAO.save(grupo);
	}

	@Override
	public void eliminarGrupo(Long id) {
		iGrupoDAO.deleteById(id);
	}

}
