package com.dangabito.projectjsf.dto;

import java.io.Serializable;

/**
 * Clase que permitira contener la información del usuario en sessión
 */
public class UsuarioDto implements Serializable{
	
	/**
	 * Nombre
	 */
	private String usuario;
	/**
	 * Contraseña
	 */
	private String password;
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	

	
	

}
