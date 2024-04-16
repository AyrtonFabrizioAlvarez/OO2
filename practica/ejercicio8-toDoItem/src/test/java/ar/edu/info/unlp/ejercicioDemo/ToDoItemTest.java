package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	private ToDoItem tareaIniciada;
	private ToDoItem tareaSinIniciar;
	private ToDoItem tareaTerminada;
	private ToDoItem tareaPausada;


	@BeforeEach
	public void setUp() throws Exception {
		this.tareaIniciada = new ToDoItem("tarea1");
		this.tareaSinIniciar = new ToDoItem("tarea2");
		this.tareaTerminada = new ToDoItem("tarea3");
		this.tareaPausada = new ToDoItem("tarea4");
		this.tareaIniciada.start();
		this.tareaTerminada.start();
		this.tareaTerminada.finish();
		this.tareaPausada.start();
		this.tareaPausada.togglePause();
	}

	@Test
	public void testStart() {
		assertTrue(this.tareaIniciada.getState() instanceof InProgressState);
		assertTrue(this.tareaSinIniciar.getState() instanceof PendingState);
		this.tareaTerminada.start();
		assertTrue(this.tareaTerminada.getState() instanceof FinishState);
		this.tareaPausada.start();
		assertTrue(this.tareaPausada.getState() instanceof PauseState);
	}
	
	@Test
	public void testTogglePause() {
		this.tareaPausada.togglePause();
		assertTrue(this.tareaPausada.getState() instanceof InProgressState);
		this.tareaIniciada.togglePause();
		assertTrue(this.tareaIniciada.getState() instanceof PauseState);
	    Exception exceptionFinished = assertThrows(RuntimeException.class, () -> {this.tareaTerminada.togglePause();});
	    assertEquals("El objeto ToDoItem no se puede pausar un item terminado",exceptionFinished.getMessage());
	    Exception exceptionPending = assertThrows(RuntimeException.class, () -> {this.tareaSinIniciar.togglePause();});
	    assertEquals("El objeto ToDoItem aun no se ha comenzado",exceptionPending.getMessage());
	}
	
	@Test
	public void testFinished() {
		assertTrue(this.tareaTerminada.getState() instanceof FinishState);
		this.tareaIniciada.finish();
		assertTrue(this.tareaIniciada.getState() instanceof FinishState);
		this.tareaSinIniciar.finish();
		assertTrue(this.tareaSinIniciar.getState() instanceof PendingState);
		this.tareaPausada.finish();
		assertTrue(this.tareaPausada.getState() instanceof FinishState);
		
	}
	
	@Test
	public void testWorkedTime() {
		Exception exceptionPending = assertThrows(RuntimeException.class, () -> {this.tareaSinIniciar.workedTime();});
		assertEquals("El objeto ToDoItem aun no se ha comenzado", exceptionPending.getMessage());
		this.tareaTerminada.setStartDate(LocalDate.of(2024, 4, 13));
		this.tareaTerminada.setFinishDate(LocalDate.of(2024, 4, 14));
		assertEquals(1,this.tareaTerminada.workedTime().toDays());
	}
	
	@Test
	public void testAddComment() {
		this.tareaIniciada.addComment("Hola esto es un comentario");
		this.tareaIniciada.addComment("Hola esto es 2do comentario");
		assertEquals("Hola esto es un comentario",this.tareaIniciada.getComments().get(0));
		assertEquals("Hola esto es 2do comentario",this.tareaIniciada.getComments().get(1));
		
		this.tareaSinIniciar.addComment("Hola esto es un comentario");
		this.tareaSinIniciar.addComment("Hola esto es 2do comentario");
		assertEquals("Hola esto es un comentario",this.tareaSinIniciar.getComments().get(0));
		assertEquals("Hola esto es 2do comentario",this.tareaSinIniciar.getComments().get(1));
		
		this.tareaPausada.addComment("Hola esto es un comentario");
		this.tareaPausada.addComment("Hola esto es 2do comentario");
		assertEquals("Hola esto es un comentario",this.tareaPausada.getComments().get(0));
		assertEquals("Hola esto es 2do comentario",this.tareaPausada.getComments().get(1));
		
		this.tareaTerminada.addComment("Hola esto es un comentario");
		assertEquals(1,this.tareaTerminada.getComments().size());
	}

}