package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDate;

public class PauseState extends State{

	
	public PauseState(ToDoItem item) {
		super(item);
	}
	
	public void togglePause() {
		this.getItem().setState(new InProgressState(getItem()));
	};
	
	public void finish() {
		this.getItem().setState(new FinishState(getItem()));
		this.getItem().setFinishDate(LocalDate.now());
	};

	public void start() {
		
	};
	
}
