package ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TijeraTest {
	Jugada piedra;
	Jugada papel;
	Jugada tijera;
	
	@BeforeEach
	public void setUp() {
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
	}
	
	@Test
	public void testJugarContraPiedra() {
		assertEquals("Gana Piedra", tijera.jugarContra(piedra));
	}
	
	@Test
	public void testJugarContraPapel() {
		assertEquals("Gana Tijera", tijera.jugarContra(papel));
	}

	@Test
	public void testJugarContraTijera() {
		tijera.jugarContra(tijera);
	}

}
