package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDate;

public class PendingState implements State{

	
	public PendingState() {
		
	}
	
	public State start() {
		return new InProgressState();
	};
	public State togglePause() {
		throw new RuntimeException("El objeto ToDoItem aun no se ha comenzado");
	};
	public State finish() {
		return null;
	};
	
	public Duration workedTime(LocalDate comienzo) {
		throw new RuntimeException("El objeto ToDoItem aun no se ha comenzado");
	};
}
