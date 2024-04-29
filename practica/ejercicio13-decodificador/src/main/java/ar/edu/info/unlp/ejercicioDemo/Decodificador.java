package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	private List<Pelicula> grilla;
	private List<Pelicula> reproducidas;
	private Sugerencia sugerencia;
	
	public Decodificador() {
		this.grilla = new ArrayList<Pelicula>();
		this.reproducidas = new ArrayList<Pelicula>();
		this.sugerencia = new Novedad();
	}
	
	public List<Pelicula> obtenerSugerencias(){
		return this.sugerencia.obtenerSugerencias(this);
	}
	
	public Sugerencia getSugerencia() {
		return sugerencia;
	}

	public void setSugerencia(Sugerencia sugerencia) {
		this.sugerencia = sugerencia;
	}
	
	public void agregarGrilla(Pelicula pelicula) {
		this.grilla.add(pelicula);
	}
	
	public void agregarReproducida(Pelicula pelicula) {
		this.reproducidas.add(pelicula);
	}
	
	public List<Pelicula> getReproducidas(){
		return this.reproducidas;
	}
	
	public List<Pelicula> getGrilla(){
		return this.grilla;
	}
	
}
