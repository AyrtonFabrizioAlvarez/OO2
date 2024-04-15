package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String name;
	private List<String> comments;
	private State state;
	private LocalDate startDate;
	private LocalDate finishDate;
	
	public ToDoItem(String name) {
		this.name = name;
		this.comments = new ArrayList<String>();
		this.state = new PendingState();
	}
	
	public void start() {
		//ACA TENDRIA PROBLEMAS
		//DODNE INSTANCIO LA HORA DE COMIENZO? ACA? DE ESA MANERA RESETEARIA STARTDATE CADA VEZ QUE HACE .START()
		//SI ME ENVIARA EL CONTEXTO, DENTRO DE STATE PODRIA HACER CONTEXTO.SETSTARTDATE()
		this.state = state.start();
	};
	
	public void togglePause() {
		this.state = state.togglePause();
	};
	
	public void finish() {
		this.state = state.finish();
	};
	
	public Duration workedTime() {
		return Duration.between(this.startDate, this.finishDate);
	};
	
	public void addComment(String comment) {
		this.comments.add(comment);
	}
}


//public void start() {
//	state.start(this);
//};
//
//public void togglePause() {
//	state.togglePause(this);
//};
//
//public void finish() {
//	state.finish(this);
//};
//
//public Duration workedTime() {
//	return Duration.between(this.startDate, this.finishDate);
//};
//
//public void addComment(String comment) {
//	state.addComment(this, comment);
//}
