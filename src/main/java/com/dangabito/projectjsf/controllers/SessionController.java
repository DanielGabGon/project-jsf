package com.dangabito.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.dangabito.projectjsf.dto.UsuarioDto;

/**
 * Clase que se encarga de mantener la información del usuario que ingresa al aplicativo en la sessión
 */
@ManagedBean
@SessionScoped
public class SessionController {
	
	/**
	 * Usuario que mantendra en sessión
	 */
	private UsuarioDto usuarioDto;
	
	@PostConstruct
	public void init() {
		System.out.println("Cargando información del usuario en la sessión...");
	}

	/**
	 * @return the usuarioDto
	 */
	public UsuarioDto getUsuarioDto() {
		return usuarioDto;
	}

	/**
	 * @param usuarioDto the usuarioDto to set
	 */
	public void setUsuarioDto(UsuarioDto usuarioDto) {
		this.usuarioDto = usuarioDto;
	}
	
	

}
