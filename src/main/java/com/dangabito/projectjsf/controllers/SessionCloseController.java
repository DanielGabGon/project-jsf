package com.dangabito.projectjsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * Clase que se encarga de cerrar la sessión del usuario
 */
@ManagedBean
public class SessionCloseController {

	@PostConstruct
	public void init(){
		System.out.println("Cerrar sessión");
	}
	
	/**
	 * Metodo que permite cerrar la sessión del usuario y regresar a la pantalla del login.
	 */
	public void cerrarSession() {
		ExternalContext externalContext= FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Metodo que permite redireccionar a una pantalla
	 * @param pagina {@link} pagina a redireccionarse
	 * @throws IOException Exception en caso de error al encontrar la página.
	 */
	private void redireccionar(String pagina) throws IOException {
		ExternalContext eContext=FacesContext.getCurrentInstance().getExternalContext();
		eContext.redirect(pagina);
	}
}
