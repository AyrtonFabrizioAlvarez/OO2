package ar.edu.info.unlp.ejercicioDemo;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private Year estreno;
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula(String titulo, double puntaje, Year estreno) {
		this.titulo = titulo;
		this.estreno = estreno;
		this.puntaje = puntaje;
		this.similares = new ArrayList<Pelicula>();
	}
	
	public void establecerSimilitud(Pelicula pelicula) {
		if (!this.similares.contains(pelicula)) {
			this.similares.add(pelicula);
			pelicula.establecerSimilitud(this);
		}
	}
	
	public Year getEstreno() {
		return this.estreno;
	}
	
	public List<Pelicula> getSimilares(){
		return this.similares;
	}
	
	public double getPuntaje() {
		return this.puntaje;
	}
	
}
