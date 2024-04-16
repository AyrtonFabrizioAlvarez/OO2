package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDate;

public class PendingState extends State{
	
	
	public PendingState(ToDoItem item) {
		super(item);
	}
	
	public void start() {
		this.getItem().setStartDate(LocalDate.now());
		this.getItem().setState(new InProgressState(this.getItem()));
		
	};
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem aun no se ha comenzado");
	};
	
	public void finish() {
	};
	
	@Override
	public Duration workedTime() {
		throw new RuntimeException("El objeto ToDoItem aun no se ha comenzado");
	}
	
}
