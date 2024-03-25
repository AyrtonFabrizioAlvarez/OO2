package ar.edu.info.unlp.ejercicioDemo;

public abstract class Empleado {

	public abstract double sueldo();
	
	public double descuento(double sueldo) {
		return sueldo - 1;
	}
}
