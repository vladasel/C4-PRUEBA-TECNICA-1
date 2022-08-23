package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.Grupo;

public interface IGrupoService {
	public List<Grupo> listarGrupos(); // Listar All

	public Grupo guardarGrupo(Grupo grupo);

	public Grupo grupoXID(Long id);

	public Grupo actualizarGrupo(Grupo grupo);

	public void eliminarGrupo(Long id);
}
