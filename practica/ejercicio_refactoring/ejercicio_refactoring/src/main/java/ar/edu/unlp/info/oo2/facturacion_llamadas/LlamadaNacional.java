package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada {
	
	public LlamadaNacional(String origen, String destino, int duracion) {
		super(origen, destino, duracion);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calcularPrecioBase() {
		// TODO Auto-generated method stub
		return getDuracion() * 3;
	}

	@Override
	protected double calcularIVA() {
		// TODO Auto-generated method stub
		return getDuracion() * 3 * 0.21;
	}

	@Override
	protected double calcularAdicional() {
		// TODO Auto-generated method stub
		return 0;
	}

}
