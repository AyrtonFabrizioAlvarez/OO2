package ar.edu.info.unlp.ejercicioDemo;

public abstract class EmpleadoFamilia extends Empleado{
	private int hijos;
	private boolean casado;
	
	protected EmpleadoFamilia(int hijos, boolean casado) {
		this.hijos = hijos;
		this.casado = casado;
	}
	
	public double calcularCasado() {
		double monto = 0;
		if (this.casado) {
			monto = 5000;
		}
		return monto;
	}
	
	public double calcularHijos() {
		return this.hijos * 2000;
	}
}
