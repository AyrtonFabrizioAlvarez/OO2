package ejercicioDemo;

public interface Jugada {

	public String jugarContra(Jugada jugadaContrincante);
	public String jugarContraPiedra();
	public String jugarContraPapel();
	public String jugarContraTijera();
}
