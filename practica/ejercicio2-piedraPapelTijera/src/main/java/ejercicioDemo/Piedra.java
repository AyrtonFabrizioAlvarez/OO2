package ejercicioDemo;

public class Piedra implements Jugada{
	
	public Piedra() {
		
	}
	
	public String jugarContra(Jugada jugadaContrincante) {
		return jugadaContrincante.jugarContraPiedra();
	}
	
	public String jugarContraPiedra() {
		return "Es Empate";
	}
	
	public String jugarContraPapel() {
		return "Gana Papel";
	}
	
	public String jugarContraTijera() {
		return "Gana Piedra";
	}

}
