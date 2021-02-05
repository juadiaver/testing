package es.iessoterohernandez.juanjose.cuentas;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;





class CuentaTest {
	
	Cuenta c;
	
	
	@BeforeEach
	void setUp() throws Exception {
		c=new Cuenta("1234","juan");
		
	}

	@Test
	void testIngresar() throws Exception {
		 
		c.ingresar("toma", 10);
		assertEquals(10,c.getSaldo());
		c.ingresar("toma", 100);
		assertEquals(110,c.getSaldo());
		
	}
	
	@Test
	void testIngresarExcepcion(){
		
		Exception thrown = assertThrows(
				Exception.class, 
	            () -> c.ingresar("toma", -1));
		assertEquals("No se puede ingresar una cantidad negativa", thrown.getMessage());
	}
	

	@Test
	void testRetirar() throws Exception{
		c.ingresar("toma", 100);
		c.retirar("me lo llevo", 50);
		assertEquals(50,c.getSaldo());
		c.retirar("me lo llevo", 50);
		assertEquals(0,c.getSaldo());
	}
	
	@Test
	void testRetirarExcepcionNegativo() {
		Exception thrown = assertThrows(
				Exception.class, 
	            () -> c.retirar("me lo llevo", -10));
				assertEquals("No se puede retirar una cantidad negativa", thrown.getMessage());
	}
	
	@Test
	void testRetirarExcepcionInsuficiente() {
		
		Exception error = assertThrows(
				Exception.class, 
	            () -> c.retirar("me lo llevo", 120));
		assertEquals("Saldo insuficiente", error.getMessage());
		
		

	}
}
