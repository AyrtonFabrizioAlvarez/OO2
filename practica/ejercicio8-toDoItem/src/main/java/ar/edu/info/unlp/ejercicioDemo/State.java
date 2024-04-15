package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDate;

public interface State {

	public State start ();
	public State togglePause();
	public State finish();
	public Duration workedTime(LocalDate comienzo);
}
