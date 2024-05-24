package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDate;

public class FinishState extends State{

	
	public FinishState(ToDoItem item) {
		super(item);
	}
	
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se puede pausar un item terminado");
	};
	
	public void start() {
		
	};

	public void finish() {

	};
	
}
