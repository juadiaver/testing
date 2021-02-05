package es.iessoterohernandez.juanjose.empleado;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;




class EmpleadoTestParametrizados {
	
	Empleado e;
	Empleado a;
	@BeforeEach
	void setUp() throws Exception {
		e= new Empleado();
		a= new Empleado();
	}
	
	
	
	@ParameterizedTest(name = "Test Plus Salario Bol")
	@CsvSource({
			"24,    100.0,   20.0,   100.0",
			"41,    100.0,   20.0,   120.0"
			
	})
	void testPlusSalario(int edad,double salario,double sueldoPlus, double expectedResult) throws Exception {
		e=new Empleado("nombre", "apellido", edad, salario);
		e.plus(sueldoPlus);
		assertEquals(expectedResult, e.getSalario());
	}

	@ParameterizedTest(name = "Test Plus Salario Boolean")
	@CsvSource({
			"24,   20.0,   false",
			"41,   20.0,   true"
			
	})
	void testPlusReturnBoolean(int edad,double sueldoPlus, boolean expectedResult) throws Exception {
		e=new Empleado("nombre", "apellido", edad);
		
		assertEquals(expectedResult, e.plus(sueldoPlus));
	}
	

	@ParameterizedTest(name = "Test Plus Salario Boolean")
	@CsvSource({
			"pepe,   rojas,   pepe,   rojas,   true",
			"pepe,   rojas,   pepe,   lopez,   false",
			"pepe,   rojas,   manuel,   rojas,   false",
			"pepe,   roja,   manuel,   lopez,   false"
			
	})
	void testEqualsEmpleado(String nombre1,String apellido1,String nombre2,String apellido2, boolean expectedResult) throws Exception {
		e=new Empleado(nombre1, apellido1);
		a=new Empleado(nombre2, apellido2);
		assertEquals(expectedResult, e.equals(a));
	}
	
	@ParameterizedTest(name = "Test Compare to")
	@CsvSource({
			"18,   25,   -1",
			"18,   18,   0",
			"25,   18,   1"
			
			
	})
	void testCompareToEmpleado(int edad1,int edad2, int expectedResult) throws Exception {
		e=new Empleado("nombre", "apellido",edad1);
		a=new Empleado("nombre", "apellido",edad2);
		assertEquals(expectedResult, e.compareTo(a));
	}

	

}
