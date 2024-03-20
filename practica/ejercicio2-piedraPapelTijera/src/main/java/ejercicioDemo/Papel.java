package ejercicioDemo;

public class Papel implements Jugada{
	
	
	public Papel() {
		
	}
	
	public String jugarContra(Jugada jugadaContrincante) {
		return jugadaContrincante.jugarContraPapel();
	}
	
	public String jugarContraPiedra() {
		return "Gana Papel";
	}
	
	public String jugarContraPapel() {
		return "Es Empate";
	}
	
	public String jugarContraTijera() {
		return "Gana Tijera";
	}
}
