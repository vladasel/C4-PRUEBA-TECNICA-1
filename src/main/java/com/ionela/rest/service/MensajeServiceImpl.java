package com.ionela.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ionela.rest.dao.IMensajeDAO;
import com.ionela.rest.dto.Mensaje;

@Service
public class MensajeServiceImpl implements IMensajeService {

	@Autowired
	IMensajeDAO iMensajeDAO;

	@Override
	public List<Mensaje> listarMensajes() {
		return iMensajeDAO.findAll();
	}

	@Override
	public Mensaje guardarMensaje(Mensaje mensaje) {
		return iMensajeDAO.save(mensaje);
	}

	@Override
	public Mensaje mensajeXID(Long id) {
		return iMensajeDAO.findById(id).get();
	}

	@Override
	public Mensaje actualizarMensaje(Mensaje mensaje) {
		return iMensajeDAO.save(mensaje);
	}

	@Override
	public void eliminarMensaje(Long id) {
		iMensajeDAO.deleteById(id);
	}

}
