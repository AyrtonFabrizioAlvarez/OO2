package ar.edu.info.unlp.ejercicioDemo;

public class EstrategiaRC4 implements Estrategia{

	public String encriptarMensaje(String mensaje) {
		return  mensaje + " encriptadoPorRC4";
	}
}
