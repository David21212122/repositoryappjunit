package org.prueba.unitaria;


import org.junit.jupiter.api.Test;
import org.servicios.empleado.ServicioEmpleado;

import junit.framework.TestCase;

/*
 * REGLAS PRUEBA UNITARIA JUNIT:
 * 
 * 1.-DEBEMOS AGREGAR DE TestCase
 * 2.-DEBEMOS CREAR EL METODO test()
 * 3.-TODOS LOS METODOS DEBEN COMENZAR CON EL NOMBRE test.......
 * 4.-TODOS LOS METODOS DEBEN LLAMAR AL METODO test()
 * 5.-TODOS LOS METODOS DEBEN LLEVAR LA ANOTACION @Test
 */
class PruebaUnitariaEmpleado extends TestCase{
	ServicioEmpleado servicioEmpleado = null;
	@Test
	void test() {
		servicioEmpleado = new ServicioEmpleado();	
	}
	
	@Test
	public void testSalarioBonoEmpleado() {
		test();
		assertTrue(servicioEmpleado.salarioBonoEmpleado(20000.0, 5000.0)==25000.0);
		
	}
	@Test
	public void testSalarioPrestamoEmpleado() {
		test();
		assertEquals(servicioEmpleado.salarioPrestamoEmpleado(20000.0, 2500.0), 17500.0);
	}
}
