package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private Estado estado;
	private List<Usuario> inscriptos;
	private List<Usuario> enEspera;
	
	
	//
	// CONSTRUCTOR
	//
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, 
						double costo, int cupoMinimo, int cupoMaximo) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.inscriptos = new ArrayList<Usuario>();
		this.enEspera = new ArrayList<Usuario>();
	}
	
	
	
	//
	//GETTERS Y SETTERS
	//
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}
	
	public LocalDate getFechaFin() {
		return this.fechaFin;
	}
	
	public String getPuntoEncuentro() {
		return this.puntoEncuentro;
	}
	
	public double getCosto() {
		return this.costo;
	}
	
	public int getCupoMinimo() {
		return this.cupoMinimo;
	}
	
	public int getCupoMaximo() {
		return this.cupoMaximo;
	}
	
	public List<Usuario> getInscriptos() {
		return this.inscriptos;
	}
	
	public List<Usuario> getEnEspera() {
		return this.enEspera;
	}
	
	public Estado getEstado() {
		return this.estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
	//
	//REALIZADOS POR EL ESTADO
	//
	public void inscribir(Usuario usuario) {
		this.estado.inscribir(usuario);
	}
	
	
	
	//
	//UTILIZADOS POR EL ESTADO
	//
	public String obtenerInformacion() {
		return "nombre : " + this.getNombre()
		+ "costo : " + this.getCosto()
		+ "fecha de inicio : "  + this.getFechaInicio()
		+ "fecha de fin : " + this.getFechaFin()
		+ "punto de encuentro : " + this.getPuntoEncuentro();
	}
	
	public boolean alcanzoCupoMinimo() {
		return this.getInscriptos().size() >= this.getCupoMinimo();
	}
	
	public boolean alcanzoCupoMaximo() {
		return this.getInscriptos().size() >= this.getCupoMaximo();
	}
	
	public String getEmails() {
		return this.inscriptos.stream()
				.map(inscripto -> inscripto.getEmail())
				.reduce("",(acumulator, element)-> acumulator +"\n" + element);
	}
	
	

}
