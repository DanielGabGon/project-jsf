package com.dangabito.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.dangabito.projectjsf.entity.Empleado;
/**
 * Clase que permite realizar la logica de negocio para empleados
 */
public class EmpleadoService {
	
	/**
	 * Metodo que permite consultar la lista de empleados de empresas TI.
	 * @return {@link Empleado} lista de empleados.
	 */
	public List<Empleado> consultarEmpleados(){
		List<Empleado> empleados = new ArrayList<>();
		
		Empleado empleadoIBM= new Empleado();
		Empleado empleadoMicro= new Empleado();
		Empleado empleadoApple= new Empleado();
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("Ramirez");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicro.setNombre("Daniel");
		empleadoMicro.setPrimerApellido("Gabriel");
		empleadoMicro.setSegundoApellido("González");
		empleadoMicro.setPuesto("Arquitecto Developer Java");
		empleadoMicro.setEstatus(false);
		
		empleadoApple.setNombre("Luís");
		empleadoApple.setPrimerApellido("López");
		empleadoApple.setSegundoApellido("Carrillo");
		empleadoApple.setPuesto("Analista");
		empleadoApple.setEstatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoApple);
		empleados.add(empleadoMicro);
		return empleados;
		
	}

}
