package es.iessoterohernandez.juanjose.empleado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

	Empleado e;
	Empleado a;
	@BeforeEach
	void setUp() throws Exception {
		e= new Empleado();
		a= new Empleado();
	}

	@Test
	void testPlus() {
		e=new Empleado("nombre", "apellido", 18, 1000);
		e.plus(500);
		assertEquals(1000, e.getSalario());
		
		e=new Empleado("nombre", "apellido", 41, 1000);
		e.plus(500);
		assertEquals(1500, e.getSalario());
		
		e=new Empleado("nombre", "apellido", 18, 1000);
		int plus=500;
		assertEquals(false, e.plus(plus));
		
		e=new Empleado("nombre", "apellido", 41, 1000);
		plus=500;
		assertEquals(true, e.plus(plus));
	}

	@Test
	void testEqualsEmpleado() {
		e=new Empleado("juan", "diaz");
		a=new Empleado("juan", "diaz");
		assertEquals(true, e.equals(a));
		
		e=new Empleado("juan", "diaz");
		a=new Empleado("juan", "lopez");
		assertEquals(false, e.equals(a));
	}

	@Test
	void testCompareTo() {
		e=new Empleado("nombre", "apellido",18);
		a=new Empleado("nombre", "apellido",18);
		assertEquals(0, e.compareTo(a));
		
		e=new Empleado("nombre", "apellido",18);
		a=new Empleado("nombre", "apellido",20);
		assertEquals(-1, e.compareTo(a));
		
		e=new Empleado("nombre", "apellido",20);
		a=new Empleado("nombre", "apellido",18);
		assertEquals(1, e.compareTo(a));
	}

}
