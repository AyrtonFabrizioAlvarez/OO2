package ar.edu.info.unlp.ejercicioDemo;

public class Temporario extends EmpleadoFamilia{
	private int horasTrabajadas;
	
	public Temporario (int hijos, int horasTrabajadas, boolean casado) {
		super(hijos, casado);
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public double calcularSueldoBasico() {
		double sueldo = 20000;
		return sueldo + (this.horasTrabajadas * 300);
	}
	
	public double calcularAdicionales() {
		return this.calcularCasado() + this.calcularHijos();
	}
}
