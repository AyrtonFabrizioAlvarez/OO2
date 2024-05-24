package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteFisico extends Cliente {
	
	private String dni;
	
	private static double descuentoFis = 0;
	
	public ClienteFisico(String nombre, String numeroTelefono, String dni) {
		super(nombre, numeroTelefono);
		this.dni = dni;
	}
	
	public String getDNI() {
		return dni;
	}
	
	public void setDNI(String dni) {
		this.dni = dni;
	}
	
	@Override
	protected double aplicarDescuento(double precio) {
		// TODO Auto-generated method stub
		return precio - precio*descuentoFis;
	}
}
