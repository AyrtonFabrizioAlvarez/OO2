package ar.edu.info.unlp.ejercicioDemo;

public class Completa extends Estado{
	
	public Completa(Excursion excursion){
		super(excursion);
	}
	
	
	//ACA YA SABRIA QUE ESTA AL MAXIMO Y SOLO AGREGO EN LA LISTA DE ESPERA
	public void inscribir(Usuario usuario) {
		this.getExcursion().getEnEspera().add(usuario);
	}
	
	public String obtenerInformacion() {
		return "";
	}
}
