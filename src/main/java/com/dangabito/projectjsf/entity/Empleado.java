package com.dangabito.projectjsf.entity;

/**
 * @author super
 * Clase que representa entidades de Empleados
 */
public class Empleado {
	/**
	 * Nombre del empleado
	 */
	private String nombre;
	/**
	 * Primer apellido del empleado
	 */
	private String primerApellido;
	/**
	 * Segundo apellido del empleado
	 */
	private String segundoApellido;
	/**
	 * Puesto del empleado
	 */
	private String puesto;
	/**
	 * Estado actual del empleado
	 */
	private boolean estatus;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public boolean isEstatus() {
		return estatus;
	}
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	

}
