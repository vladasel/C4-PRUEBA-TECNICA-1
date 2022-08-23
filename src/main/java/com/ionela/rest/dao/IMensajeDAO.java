package com.ionela.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ionela.rest.dto.Mensaje;

public interface IMensajeDAO extends JpaRepository<Mensaje,Long>{

}
