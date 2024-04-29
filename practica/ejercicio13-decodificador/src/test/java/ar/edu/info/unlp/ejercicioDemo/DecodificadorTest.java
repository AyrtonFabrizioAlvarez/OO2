package ar.edu.info.unlp.ejercicioDemo;


import static org.junit.jupiter.api.Assertions.*;

import java.time.Year;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DecodificadorTest {
	private Decodificador decodificador;
	private Pelicula thor;
	private Pelicula capitanAmerica;
	private Pelicula ironMan;
	private Pelicula dunkirk;
	private Pelicula rocky;
	private Pelicula rambo;
	

	@BeforeEach
	void setUp() throws Exception {
		this.thor = new Pelicula("Thor", 7.9, Year.of(2007));
		this.capitanAmerica = new Pelicula("Capitan America", 7.8, Year.of(2016));
		this.ironMan = new Pelicula("Iron man", 7.9, Year.of(2010));
		this.dunkirk = new Pelicula("Dunkirk", 7.9, Year.of(2017));
		this.rocky = new Pelicula("Rocky", 8.1, Year.of(1976));
		this.rambo = new Pelicula("Rambo", 7.8, Year.of(1979));
		
		this.thor.establecerSimilitud(capitanAmerica);
		this.thor.establecerSimilitud(ironMan);
		this.capitanAmerica.establecerSimilitud(ironMan);
		this.rocky.establecerSimilitud(rambo);
		
		this.decodificador = new Decodificador();
		
		this.decodificador.agregarGrilla(thor);
		this.decodificador.agregarGrilla(capitanAmerica);
		this.decodificador.agregarGrilla(ironMan);
		this.decodificador.agregarGrilla(dunkirk);
		this.decodificador.agregarGrilla(rocky);
		this.decodificador.agregarGrilla(rambo);
		this.decodificador.agregarReproducida(thor);
		this.decodificador.agregarReproducida(rocky);
	}

	@Test
	void testObtenerSugerencias() {
		assertTrue(this.decodificador.obtenerSugerencias().contains(dunkirk));
		assertTrue(this.decodificador.obtenerSugerencias().contains(capitanAmerica));
		assertTrue(this.decodificador.obtenerSugerencias().contains(ironMan));
		this.decodificador.setSugerencia(new Similaridad());
		assertTrue(this.decodificador.obtenerSugerencias().contains(capitanAmerica));
		assertTrue(this.decodificador.obtenerSugerencias().contains(ironMan));
		assertTrue(this.decodificador.obtenerSugerencias().contains(rambo));
		this.decodificador.setSugerencia(new Puntaje());
		assertTrue(this.decodificador.obtenerSugerencias().contains(capitanAmerica));
		assertTrue(this.decodificador.obtenerSugerencias().contains(ironMan));
		assertTrue(this.decodificador.obtenerSugerencias().contains(dunkirk));
	}
}
