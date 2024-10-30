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
		
		Empleado empleadoNexflix= new Empleado();
		Empleado empleadoAmazon= new Empleado();
		Empleado empleadoHp= new Empleado();
		
		Empleado empleadoOracle= new Empleado();
		Empleado empleadoDeloite= new Empleado();
		Empleado empleadoDisney= new Empleado();
		
		Empleado empleadoBoostrat= new Empleado();
		Empleado empleadoGoogle= new Empleado();
		Empleado empleadoBestBuy= new Empleado();
		
		
		empleadoIBM.setNombre("Marco");
		empleadoIBM.setPrimerApellido("Mendez");
		empleadoIBM.setSegundoApellido("Romulo");
		empleadoIBM.setPuesto("Oracle");
		empleadoIBM.setEstatus(true);
		
		empleadoMicro.setNombre("Olivia");
		empleadoMicro.setPrimerApellido("Gongora");
		empleadoMicro.setSegundoApellido("Alvárez");
		empleadoMicro.setPuesto("Cientifica");
		empleadoMicro.setEstatus(false);
		
		empleadoApple.setNombre("Alfredo");
		empleadoApple.setPrimerApellido("González");
		empleadoApple.setSegundoApellido("Perez");
		empleadoApple.setPuesto("Desa");
		empleadoApple.setEstatus(true);
		
		empleadoNexflix.setNombre("Diego");
		empleadoNexflix.setPrimerApellido("Paniagua");
		empleadoNexflix.setSegundoApellido("Ramirez");
		empleadoNexflix.setPuesto("Senior Developer Java");
		empleadoNexflix.setEstatus(true);
		
		empleadoAmazon.setNombre("Daniel");
		empleadoAmazon.setPrimerApellido("Gabriel");
		empleadoAmazon.setSegundoApellido("González");
		empleadoAmazon.setPuesto("Arquitecto Developer Java");
		empleadoAmazon.setEstatus(false);
		
		empleadoHp.setNombre("Luís");
		empleadoHp.setPrimerApellido("López");
		empleadoHp.setSegundoApellido("Carrillo");
		empleadoHp.setPuesto("Analista");
		empleadoHp.setEstatus(true);
		
		empleadoOracle.setNombre("Armando");
		empleadoOracle.setPrimerApellido("Perez");
		empleadoOracle.setSegundoApellido("Garnica");
		empleadoOracle.setPuesto("Developer Java");
		empleadoOracle.setEstatus(true);
		
		empleadoDeloite.setNombre("Sofia");
		empleadoDeloite.setPrimerApellido("Quijano");
		empleadoDeloite.setSegundoApellido("Garcia");
		empleadoDeloite.setPuesto("Analista");
		empleadoDeloite.setEstatus(false);
		
		empleadoDisney.setNombre("Joel");
		empleadoDisney.setPrimerApellido("Luciano");
		empleadoDisney.setSegundoApellido("Carrasco");
		empleadoDisney.setPuesto("UX");
		empleadoDisney.setEstatus(true);
		
		empleadoBoostrat.setNombre("Demencio");
		empleadoBoostrat.setPrimerApellido("Origel");
		empleadoBoostrat.setSegundoApellido("Romulo");
		empleadoBoostrat.setPuesto("Secretario");
		empleadoBoostrat.setEstatus(true);
		
		empleadoGoogle.setNombre("Karla");
		empleadoGoogle.setPrimerApellido("Ruiz");
		empleadoGoogle.setSegundoApellido("Gomez");
		empleadoGoogle.setPuesto("Middle Java");
		empleadoGoogle.setEstatus(false);
		
		empleadoBestBuy.setNombre("Alfonso");
		empleadoBestBuy.setPrimerApellido("Palillo");
		empleadoBestBuy.setSegundoApellido("Gomora");
		empleadoBestBuy.setPuesto("Database");
		empleadoBestBuy.setEstatus(true);
		
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoApple);
		empleados.add(empleadoMicro);
		
		empleados.add(empleadoNexflix);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoHp);
		
		empleados.add(empleadoOracle);
		empleados.add(empleadoDeloite);
		empleados.add(empleadoDisney);
		
		empleados.add(empleadoBoostrat);
		empleados.add(empleadoGoogle);
		empleados.add(empleadoBestBuy);
		return empleados;
		
	}

}
