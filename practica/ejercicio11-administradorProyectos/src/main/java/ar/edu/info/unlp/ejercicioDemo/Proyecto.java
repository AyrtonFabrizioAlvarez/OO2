package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Proyecto {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechafin;
	private String objetivo;
	private int integrantes;
	private double pagoDiario;
	private double ganancia;
	private Etapa etapa;
	
	public Proyecto(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String objetivo, int integrantes, double pagoDiario) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechafin = fechaFin;
		this.objetivo = objetivo;
		this.integrantes = integrantes;
		this.pagoDiario = pagoDiario;
		this.ganancia = 0.07;
		this.etapa = new Construccion(this);
	}
	
	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}
	
	public void aprobarEtapa() {
		this.etapa.aprobarEtapa();
	}
	
	public double getPrecio() {
		return this.etapa.getPrecio();
	}
	
	public double getCosto() {
		return this.etapa.getCosto();
	}
	
	public void modificarMargen(double margen) {
		this.etapa.modificarMargen(margen);
	}
	
	public void cancelarProyecto() {
		this.etapa.cancelarObjetivo();
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechafin() {
		return fechafin;
	}

	public String getNombre() {
		return nombre;
	}

	public String getObjetivo() {
		return this.objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}


	public int getIntegrantes() {
		return integrantes;
	}


	public double getPagoDiario() {
		return pagoDiario;
	}


	public double getGanancia() {
		return ganancia;
	}
	
	public void setGanancia(double ganancia) {
		this.etapa.modificarMargen(ganancia);
	}

	public Etapa getEtapa() {
		return etapa;
	}


	
}
