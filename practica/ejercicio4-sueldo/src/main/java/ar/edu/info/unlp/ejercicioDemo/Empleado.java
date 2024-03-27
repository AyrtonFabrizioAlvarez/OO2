package ar.edu.info.unlp.ejercicioDemo;

public abstract class Empleado {

	public double sueldo() {
		double sueldo = this.calcularSueldoBasico();
		double adicional = this.calcularAdicionales();
		double sueldoConDescuento = calcularDescuento(sueldo, adicional);
		return sueldoConDescuento;
	};
	
	
	
	public double calcularDescuento(double basico, double adicional) {
		double descuentoBasico = basico * 0.13;
		basico = basico - descuentoBasico;
		double descuentoAdicional = adicional * 0.05;
		adicional = adicional - descuentoAdicional;
		return basico + adicional;
	}
	
	public abstract double calcularAdicionales();
	
	public abstract double calcularSueldoBasico();	
}
