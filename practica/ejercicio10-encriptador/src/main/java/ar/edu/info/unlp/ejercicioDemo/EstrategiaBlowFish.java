package ar.edu.info.unlp.ejercicioDemo;

public class EstrategiaBlowFish implements Estrategia{

	public String encriptarMensaje(String mensaje) {
		return  mensaje + " encriptadoPorBlowFish";
	}
}
