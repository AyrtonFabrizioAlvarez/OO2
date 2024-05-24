package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteJuridico extends Cliente {
	
	private String cuit;
	
	private static double descuentoJur = 0.15;
	
	public ClienteJuridico(String nombre, String numeroTelefono, String cuit) {
		super(nombre, numeroTelefono);
		this.cuit = cuit;
	}
	
	public String getCuit() {
		return cuit;
	}
	
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
	@Override
	protected double aplicarDescuento(double precio) {
		// TODO Auto-generated method stub
		return precio - precio*descuentoJur;
	}
}
