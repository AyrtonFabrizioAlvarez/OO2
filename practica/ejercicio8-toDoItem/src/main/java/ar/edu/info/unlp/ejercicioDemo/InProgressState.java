package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDate;

public class InProgressState extends State{

	
	public InProgressState(ToDoItem item) {
		super(item);
	}
	
	public void togglePause() {
		this.getItem().setState(new PauseState(this.getItem()));
	};
	public void finish() {
		this.getItem().setState(new FinishState(this.getItem()));
		this.getItem().setFinishDate(LocalDate.now());
	};

	public void start() {
		
	};

}
