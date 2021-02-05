package es.iessoterohernandez.juanjose.cuentas;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {

Movimiento m;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		m = new Movimiento();
		
	}
	

	@Test
	public void testGetImporte() {
		
		m.setImporte(100);
		assertEquals(100,m.getImporte());
	}

	@Test
	public void testGetConcepto() {
		m.setConcepto("nuevo");
		assertEquals("nuevo",m.getConcepto());
	}

	@Test
	public void testSetConcepto() {
		m.setImporte(100);
		assertEquals(100,m.getImporte());
	}

	@Test
	public void testSetImporte() {
		m.setConcepto("nuevo");
		assertEquals("nuevo",m.getConcepto());
	}
	}


