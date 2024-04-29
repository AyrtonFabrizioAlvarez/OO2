package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
	private Proyecto proyecto;
	private Proyecto proyectoPrecio0;
	
	@BeforeEach
	public void setUp() throws Exception {
		this.proyecto = new Proyecto("Vacaciones de invierno", LocalDate.of(2023, 7, 15), LocalDate.of(2023, 7, 25), "salir con amigos",3,1500);
		this.proyectoPrecio0 = new Proyecto("Vacaciones de invierno", LocalDate.of(2023, 7, 15), LocalDate.of(2023, 7, 25), "salir con amigos",3,0);
		this.proyecto.aprobarEtapa();
	}

	@Test
	public void testAprobarEtapa() {
	    assertTrue(this.proyecto.getEtapa() instanceof Evaluacion);
		this.proyecto.aprobarEtapa();
		assertTrue(this.proyecto.getEtapa() instanceof Confirmada);
		this.proyecto.aprobarEtapa();
		assertTrue(this.proyecto.getEtapa() instanceof Confirmada);
		
		Exception exceptionPrecio0 = assertThrows(RuntimeException.class, () -> {this.proyectoPrecio0.aprobarEtapa();});
	    assertEquals("No se puede pasar a evaluacion un proyecto de precio 0",exceptionPrecio0.getMessage());
	}
	
	@Test
	public void testCostoYPrecioDelProyecto() {
		assertEquals(45000,this.proyecto.getCosto());
		assertEquals(48150,this.proyecto.getPrecio());
		
		assertEquals(0,this.proyectoPrecio0.getCosto());
		assertEquals(0,this.proyectoPrecio0.getPrecio());
	}
	
	@Test
	public void testModificarMargenDeGanancias() {		
		this.proyecto.setGanancia(0.10);
		assertEquals(48150,this.proyecto.getPrecio());
		this.proyecto.setGanancia(0.16);
		assertEquals(48150,this.proyecto.getPrecio());
		this.proyecto.setGanancia(0.11);
		assertEquals(49950,this.proyecto.getPrecio());
		this.proyecto.setGanancia(0.15);
		assertEquals(51750,this.proyecto.getPrecio());
		
		this.proyecto.aprobarEtapa();
		this.proyecto.setGanancia(0.10);
		assertEquals(51750,this.proyecto.getPrecio());
	}
	
	@Test
	public void testCancelarProyecto() {
		this.proyecto.cancelarProyecto();
		assertEquals("salir con amigos (Cancelado)",this.proyecto.getObjetivo());
		this.proyecto.cancelarProyecto();
		assertEquals("salir con amigos (Cancelado)",this.proyecto.getObjetivo());
	}

}