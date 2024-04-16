package ar.edu.info.unlp.ejercicioDemo;

import java.time.temporal.ChronoUnit;

public abstract class Etapa {
	private Proyecto proyecto;
	
	public Etapa(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
	public double getPrecio() {
		return this.getCosto() * this.getProyecto().getGanancia() + this.getCosto();
	}
	
	public double getCosto() {
		return this.getProyecto().getPagoDiario() * this.getProyecto().getIntegrantes() * this.calcularDiasDuracion();
	}
	
	public Proyecto getProyecto() {
		return this.proyecto;
	}
	
	public long calcularDiasDuracion() {
		return ChronoUnit.DAYS.between(this.getProyecto().getFechaInicio(), this.getProyecto().getFechafin());
	}
	
	public void cancelarObjetivo() {
		if (!this.getProyecto().getObjetivo().contains("(Cancelar)")) {
			String objetivoCancelado = this.getProyecto().getObjetivo() + " (Cancelar)";
			this.getProyecto().setObjetivo(objetivoCancelado);
		}
	}
	
	public abstract void aprobarEtapa();
	public abstract void modificarMargen(double margen);
}
