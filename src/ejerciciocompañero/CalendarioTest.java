package Act_Evaluable;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalendarioTest {

	@Test
	void incrementarDiaSinCambioDeMesNiCambioDeAño() {
		Calendario calendario = new Calendario(2024, 03, 27);
		calendario.incrementarDia(); 
		

		assertEquals(calendario.getDia(), 28);
		assertEquals(calendario.getMes(), 3);
		assertEquals(calendario.getAño(), 2024);
	}

	@Test
	void incrementarDiaConCambioDeMesSinCambioDeAño() {
		Calendario calendario = new Calendario(2024, 1, 31);

		calendario.incrementarDia();

		assertEquals(calendario.getDia(), 1);
		assertEquals(calendario.getMes(), 2);
		assertEquals(calendario.getAño(), 2024);
	}
	@Test
	void incrementarDiaConCambioDeMesYCambioDeAño() {
		Calendario calendario = new Calendario(2023, 12, 31);
		calendario.incrementarDia();

		assertEquals(calendario.getDia(), 1);
		assertEquals(calendario.getMes(), 1);
		assertEquals(calendario.getAño(), 2024);
	}

	@Test
	void incrementaDiaAñoBisiesto() {
		Calendario calendario = new Calendario(2024, 2, 28);
		calendario.incrementarDia();

		assertEquals(calendario.getDia(), 29);
		assertEquals(calendario.getMes(), 2);
		assertEquals(calendario.getAño(), 2024);
	}

	@Test
	public void testIncrementarMes() {
		
		Calendario calendario = new Calendario(2024, 2, 1);

		
		calendario.incrementarMes();

		
		assertEquals(calendario.getDia(), 1);
		assertEquals(calendario.getMes(), 3);
		assertEquals(calendario.getAño(), 2024);
	}
		@Test
		public void testIncrementarMes10() {
		Calendario calendario = new Calendario(2024, 2, 1);
		
		for (int i = 0; i < 10; i++) {
			calendario.incrementarMes();
			}
		
		assertEquals(calendario.getDia(), 1);
		assertEquals(calendario.getMes(), 12);
		assertEquals(calendario.getAño(), 2024);
		}
		
		@Test
		public void testIncrementarMesCambiandodeaño() {
		Calendario calendario = new Calendario(2024, 12, 1);
		calendario.incrementarMes();

		
		assertEquals(calendario.getDia(), 2);
		assertEquals(calendario.getMes(), 2);
		assertEquals(calendario.getAño(), 2025);
		}
		
		@Test
		public void testIncrementarMesAñoBisiesto() {
		Calendario calendario = new Calendario(2024, 1, 31);
		calendario.incrementarMes();

		assertEquals(calendario.getDia(), 1);
		assertEquals(calendario.getMes(), 3);
		assertEquals(calendario.getAño(), 2024);
	}
	@Test
	void incrementarAño() {
		Calendario c = new Calendario(2024, 02, 23);
		assertEquals(c.getAño(), 2025);

	}
	@Test
	public void calendariosiguales(){
		Calendario c = new Calendario(2024, 02, 23);
		Calendario h = new Calendario(2024, 02, 23);
		assertTrue(c == h) ;
	}
	@Test
	public void calendariosnosoniguales(){
		Calendario c = new Calendario(2024, 02, 23);
		Calendario h = new Calendario(2024, 04, 27);
		assertFalse(c == h) ;
	}
	
}
