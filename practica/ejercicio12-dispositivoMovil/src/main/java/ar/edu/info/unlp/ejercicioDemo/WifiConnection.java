package ar.edu.info.unlp.ejercicioDemo;

public class WifiConnection implements Connection{


	public String sendData(String data, long crc) {
		return "Utilizando la conexion wifi para enviar datos";
	}


	public String pict() {
		return "Simbolo de conexion wifi";
	}

	
}
