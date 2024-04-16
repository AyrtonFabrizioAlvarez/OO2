package ar.edu.info.unlp.ejercicioDemo;

public class EstrategiaRSA implements Estrategia{

	public String encriptarMensaje(String mensaje) {
		return mensaje + " encriptadoPorRSA";
	}
}
