package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private String origen;
	private String destino;
	private int duracion;

	public Llamada(String origen, String destino, int duracion) {
		this.origen= origen;
		this.destino= destino;
		this.duracion = duracion;
	}

	public String getRemitente() {
		return destino;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public String getOrigen() {
		return origen;
	}
	
	public double calcularPrecioLlamada() {
		return this.calcularPrecioBase() +
				this.calcularIVA() +
				this.calcularAdicional();
	}
	
	protected abstract double calcularPrecioBase();
	
	protected abstract double calcularIVA();
	
	protected abstract double calcularAdicional();
}
