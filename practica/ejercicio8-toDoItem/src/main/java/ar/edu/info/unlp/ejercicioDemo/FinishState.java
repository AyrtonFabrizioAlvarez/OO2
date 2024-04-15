package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDate;

public class FinishState implements State{

	
	public FinishState() {
		
	}
	
	public State start() {
		return null;
	};
	public State togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se puede pausar un item terminado");
	};
	public State finish() {
		return null;
	};
	
	public Duration workedTime(LocalDate comienzo) {
		return Duration.between(comienzo, LocalDate.now());
	};
}
