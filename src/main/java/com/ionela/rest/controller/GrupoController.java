package com.ionela.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ionela.rest.dto.Grupo;
import com.ionela.rest.service.GrupoServiceImpl;

@RestController
@RequestMapping("/api")
public class GrupoController {
	@Autowired
	GrupoServiceImpl grupoServiceImpl;

	@GetMapping("/grupos")
	public List<Grupo> listarGrupos() {
		return grupoServiceImpl.listarGrupos();
	}

	@PostMapping("/grupos")
	public Grupo salvarGrupo(@RequestBody Grupo grupo) {

		return grupoServiceImpl.guardarGrupo(grupo);
	}

	@GetMapping("/grupos/{id}")
	public Grupo grupoXID(@PathVariable(name = "id") Long id) {

		return grupoServiceImpl.grupoXID(id);
	}
}
