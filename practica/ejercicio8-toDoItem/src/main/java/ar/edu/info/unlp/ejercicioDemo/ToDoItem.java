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
		this.state = new PendingState(this);
	}
	
	
	//GETTERS Y SETTERS (SE UTILIZAN EN LAS SUBCLASES DE STATE)
	public LocalDate getStartDate() {
		return this.startDate;
	}
	
	public void setStartDate(LocalDate start) {
		this.startDate = start;
	}
	
	public LocalDate getFinishDate() {
		return this.finishDate;
	}
	
	public void setFinishDate(LocalDate finish) {
		this.finishDate = finish;
	}
	
	public State getState() {
		return this.state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public List<String> getComments() {
		return this.comments;
	}
	
	
	//MODIFICACIONES DE ESTADO REALIZADAS POR LAS INSTANCIAS DE STATE
	public void start() {
		this.state.start();
	};
	
	public void togglePause() {
		this.state.togglePause();
	};
	
	public void finish() {
		this.state.finish();
	};
	
	public Duration workedTime() {
		return this.state.workedTime();
	};
	
	public void addComment(String comment) {
		this.state.addComment(comment);
	}
}