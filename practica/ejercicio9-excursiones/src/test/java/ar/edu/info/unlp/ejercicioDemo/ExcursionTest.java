package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	
	
	
	//nombre : Dos dias en kayak bajando el Paranácosto : 1000.0fecha de inicio : 2024-04-14fecha de fin : 2024-04-15punto de encuentro : punto de encuentrolugares restantes para el cupo minimo: 2
	//nombre : Dos días en kayak bajando el Paranácosto : 1000.0fecha de inicio : 2024-04-14fecha de fin : 2024-04-15punto de encuentro : punto de encuentrolugares restantes para el cupo minimo: 1
	Excursion excursion;
	Usuario usuario1, usuario2, usuario3;
	String sinCupoMinimo =  "nombre : " + "Dos días en kayak bajando el Paraná"
			+ "costo : " + 1000.0
			+ "fecha de inicio : "  + "2024-04-14"
			+ "fecha de fin : " + "2024-04-15"
			+ "punto de encuentro : " + "punto de encuentro"
			+ "lugares restantes para el cupo minimo: " + 1;
	String sinCupoMaximo =  "nombre : " + "Dos días en kayak bajando el Paraná"
			+ "costo : " + 1000.0
			+ "fecha de inicio : "  + "2024-04-14"
			+ "fecha de fin : " + "2024-04-15"
			+ "punto de encuentro : " + "punto de encuentro"
			+ "lugares restantes para el cupo minimo: " + 1;
	
	@BeforeEach
	void setUp() throws Exception {
		excursion = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.of(2024, 04, 14), LocalDate.of(2024, 04, 15), "punto de encuentro", 1000, 1, 2);
		usuario1 = new Usuario("Winston1", "Smith1", "winston1@smith.com");
		usuario2 = new Usuario("Winston2", "Smith2", "winston2@smith.com");
		usuario3 = new Usuario("Winston3", "Smith3", "winston3@smith.com");
		
		System.out.println(excursion.getCupoMinimo());
		System.out.println(excursion.getInscriptos().size());
		
	};
	
    @Test
    public void testSinCupoMinimo() {
        assertEquals(sinCupoMinimo, excursion.obtenerInformacion());
        assertEquals(0, excursion.getInscriptos().size());
    }
    
    @Test
	public void testInscribir() {
    	this.excursion.inscribir(usuario1);
    	this.excursion.inscribir(usuario2);
    	this.excursion.inscribir(usuario3);
		assertEquals(1,this.excursion.getEnEspera().size());
		assertEquals(2,this.excursion.getInscriptos().size());
		assertTrue(this.excursion.getInscriptos().contains(usuario1));
		assertTrue(this.excursion.getInscriptos().contains(usuario2));
		assertFalse(this.excursion.getInscriptos().contains(usuario3));
		assertTrue(this.excursion.getEnEspera().contains(usuario3));
		assertTrue(this.excursion.getEstado() instanceof Completa);
	}
    
//    @Test
//    public void testSinCupoMaximo() {
//    	excursion.inscribir(usuario1);
//    	assertEquals("Glosing, James", excursion.obtenerInformacion());
//    	assertEquals(1, excursion.getInscriptos().size());
//    }
    
//    @Test
//    public void testConCupoMaximo() {
//    	excursion.inscribir(usuario1);
//    	excursion.inscribir(usuario2);
//    	assertEquals("Glosing, James", excursion.obtenerInformacion());
//    	assertEquals(2, excursion.getInscriptos().size());
//    }
//    
//    @Test
//    public void testConCupoExcedido() {
//    	excursion.inscribir(usuario1);
//    	excursion.inscribir(usuario2);
//    	excursion.inscribir(usuario3);
//    	assertEquals("Glosing, James", excursion.obtenerInformacion());
//    	assertEquals(0, excursion.getEnEspera().size());
//    }
}
