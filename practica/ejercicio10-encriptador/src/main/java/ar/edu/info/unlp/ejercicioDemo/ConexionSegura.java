package ar.edu.info.unlp.ejercicioDemo;

public class ConexionSegura extends Conexion{
	private Estrategia estrategia;
	
	public ConexionSegura(Estrategia estrategia) {
		this.estrategia = estrategia;;
	}
	
	public Estrategia getEstrategia() {
		return this.estrategia;
	}
	
	public void setEstrategia(Estrategia estrategia) {
		this.estrategia = estrategia;
	};
	
	
	//ACA DEBERIA HACER ALGO MAS? ENCRIPTO Y QUE PASA CON ESE MENSAJE?
	public void enviarMensaje(String mensaje) {
		String mensajeEncriptado = this.estrategia.encriptarMensaje(mensaje);
	}
}
