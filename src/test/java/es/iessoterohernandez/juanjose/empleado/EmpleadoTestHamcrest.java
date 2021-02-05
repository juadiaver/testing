package es.iessoterohernandez.juanjose.empleado;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
class EmpleadoTestHamcrest {
	
	Empleado e;
	Empleado a;
	@BeforeEach
	void setUp() throws Exception {
		e= new Empleado();
		a= new Empleado();
	}

	@Test
	void testEqualsEmpleado() {
		e=new Empleado("juan", "diaz");
		a=new Empleado("juan", "diaz");
		assertThat(true, is(a.equals(e)));
		
}
	
	@Test
	void testCompareTo() {
		e=new Empleado("nombre", "apellido",18);
		a=new Empleado("nombre", "apellido",18);
		assertThat(0, is(e.compareTo(a)));
		
		e=new Empleado("nombre", "apellido",18);
		a=new Empleado("nombre", "apellido",20);
		assertThat(-1, is(e.compareTo(a)));
		
		e=new Empleado("nombre", "apellido",20);
		a=new Empleado("nombre", "apellido",18);
		assertThat(1, is(e.compareTo(a)));
	}
	
	@Test
	void testPlus() {
		e=new Empleado("nombre", "apellido", 18, 1000);
		e.plus(500);
		assertThat(1000.0, is(e.getSalario()));
		
		e=new Empleado("nombre", "apellido", 41, 1000);
		e.plus(500);
		assertThat(1500.0, is(e.getSalario()));
		
		e=new Empleado("nombre", "apellido", 18, 1000);
		int plus=500;
		assertThat(false, equalTo(e.plus(plus)));
		
		e=new Empleado("nombre", "apellido", 41, 1000);
		plus=500;
		assertThat(true, equalTo(e.plus(plus)));
	}
}
