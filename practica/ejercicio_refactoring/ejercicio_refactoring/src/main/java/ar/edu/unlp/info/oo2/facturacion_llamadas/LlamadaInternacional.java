package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada {
	
	public LlamadaInternacional(String origen, String destino, int duracion) {
		super(origen, destino, duracion);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calcularPrecioBase() {
		// TODO Auto-generated method stub
		return getDuracion() * 150;
	}

	@Override
	protected double calcularIVA() {
		// TODO Auto-generated method stub
		return getDuracion() * 150 * 0.21;
	}

	@Override
	protected double calcularAdicional() {
		// TODO Auto-generated method stub
		return 50;
	}

}
