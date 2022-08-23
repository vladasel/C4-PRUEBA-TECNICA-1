package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.Mensaje;



public interface IMensajeService {
	public List<Mensaje> listarMensajes();

	public Mensaje guardarMensaje(Mensaje mensaje);

	public Mensaje mensajeXID(Long id);

	public Mensaje actualizarMensaje(Mensaje mensaje);

	public void eliminarMensaje(Long id);
}
