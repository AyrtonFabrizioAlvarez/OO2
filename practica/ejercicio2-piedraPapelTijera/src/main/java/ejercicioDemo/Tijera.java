package ejercicioDemo;

public class Tijera implements Jugada{
	
	public Tijera() {
		
	}
	
	public String jugarContra(Jugada jugadaContrincante) {
		return jugadaContrincante.jugarContraTijera();
	}
	
	public String jugarContraPiedra() {
		return "Gana Piedra";
	}
	
	public String jugarContraPapel() {
		return "Gana Tijera";
	}
	
	public String jugarContraTijera() {
		return "Es Empate";
	}

}
