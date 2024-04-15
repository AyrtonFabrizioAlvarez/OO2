package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDate;

public class PauseState implements State{

	
	public PauseState() {
		
	}
	
	public State start() {
		return null;
	};
	public State togglePause() {
		return new InProgressState();
	};
	public State finish() {
		return new FinishState();
	};
	
	public Duration workedTime(LocalDate comienzo) {
		return Duration.between(comienzo, LocalDate.now());
	};
}
