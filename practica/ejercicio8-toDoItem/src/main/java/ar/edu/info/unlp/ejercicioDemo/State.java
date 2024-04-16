package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDate;

public abstract class State {
	private ToDoItem item;
	
	public State(ToDoItem item) {
		this.item = item;
	}
	
	public ToDoItem getItem() {
		return this.item;
	}
	
	public abstract void start ();
	public abstract void togglePause();
	public abstract void finish();
	
	
	//METODOS COMUNES A TODOS LOS ESTADOS
	
	//AGREGAR COMENTARIO AL ITEM
	public void addComment(String comment) {
		this.item.getComments().add(comment);
	};
	
	//VISUALIZAR TIEMPO TRANSCURRIDO
	//
	//CONSULTAR, ES COMUN A TODOS? O JUSTAMENTE EN TODOS SE IMPLEMENTA COMO "DESDE" STARTDATE() "HASTA" LOCALDATE.NOW()
	//			 EXCEPTO EN FINISH QUE ES DODNE SE SETEA FINISH DATE Y SE CONSULTA "DESDE" STARTDATE() "HASTA" FINISHDATE()
	public Duration workedTime() {
		return Duration.between(item.getStartDate(), item.getFinishDate());
	};
}
