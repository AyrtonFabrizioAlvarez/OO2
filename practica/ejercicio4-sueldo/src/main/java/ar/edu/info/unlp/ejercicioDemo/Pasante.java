package ar.edu.info.unlp.ejercicioDemo;

public class Pasante extends Empleado{

	private int examenesRendidos;
	
	public Pasante(int examenes) {
		this.examenesRendidos = examenes;
	}
	
	public double calcularSueldoBasico() {
		return 20000;
	}
	
	public double calcularAdicionales() {
		return 2000 * this.examenesRendidos;
	}
}
