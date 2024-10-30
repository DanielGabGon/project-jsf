package com.dangabito.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.dangabito.projectjsf.dto.UsuarioDto;

/**
 * @author super
 * Clase que permite controllar el funcionamiento con la pantalla de login.xhtml
 */
@ManagedBean
public class LoginController {
	
	/**
	 * Usuario que ingresan en el login
	 */
	private String usuario;
	
	/**
	 * Contraseña ingresada en el login
	 */
	private String password;
	
	/**
	 * Bean que mantiene la información en sessión
	 */
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	/**
	 * Metodo que permite ingresar a la pantalla principal del login.
	 */
	public void ingresar() {
		System.out.println("Usuario:"+usuario);
		if(usuario.equalsIgnoreCase("Daniel") && password.equals("12345")) {
			try {
				UsuarioDto usuarioDto = new UsuarioDto();
				usuarioDto.setUsuario(usuario);
				usuarioDto.setPassword(password);
				this.sessionController.setUsuarioDto(usuarioDto);
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				  FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_FATAL, "La Página no existe",""));
				e.printStackTrace();
			}
		}else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtPassword", new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario y/o Contraseña incorrectos", ""));
		}
		
	}
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext eContext=FacesContext.getCurrentInstance().getExternalContext();
		eContext.redirect(pagina);
	}

	/**
	 * @return the sessionController
	 */
	public SessionController getSessionController() {
		return sessionController;
	}

	/**
	 * @param sessionController the sessionController to set
	 */
	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}

}
