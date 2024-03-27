package ar.edu.info.unlp.ejercicioDemo;

public class Planta extends EmpleadoFamilia{
	private int antiguedad;
		
	public Planta(int hijos, int antiguedad, boolean casado) {
		super(hijos, casado);
		this.antiguedad = antiguedad;
	}
	
	public double calcularSueldoBasico() {
		return 50000;
	}
	
	public double calcularAdicionales() {
		return (this.antiguedad * 2000) + this.calcularCasado() + this.calcularHijos();
	}
}
