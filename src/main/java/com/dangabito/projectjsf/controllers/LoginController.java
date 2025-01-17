package com.dangabito.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

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
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				  FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_FATAL, "La Página no existe",""));
				e.printStackTrace();
			}
		}else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario y/o Contraseña incorrectos", ""));
		}
		
	}
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext eContext=FacesContext.getCurrentInstance().getExternalContext();
		eContext.redirect(pagina);
	}

}
