package ar.edu.info.unlp.ejercicioDemo;

public class FourgConnection {
	private String symb;
	
	public FourgConnection() {
		
	}
	
	public String transmit(String data, long crc) {
		return "Utilizando la conexion 4g para transmitir datos";
	}

	public String getSymb() {
		return symb;
	}
}
