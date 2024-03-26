package ar.edu.info.unlp.ejercicioDemo;

public abstract class Empleado {

	public double sueldo() {
		double sueldo = 0;
		double basico = calcularSueldoBasico();
		double adicional = calcularAdicionales();
		double descuento = calcularDescuento();
		return (basico + adicional - descuento);
	};
	
	
	
	public double calcularDescuento() {
		return 0.0;
	}
	
	public double calcularAdicionales() {
		return 0.0;
	}
	
	public double calcularSueldoBasico() {
		return 0.0;
	}
	
}
