package ar.edu.info.unlp.ejercicioDemo;

public class Dispositivo {
	private Connection connection;
	private Ringer ringer;
	private Display display;
	private Calculator calculator;
	
	public Dispositivo(Connection connection, Calculator calculator) {
		this.connection = connection;
		this.ringer = new Ringer();
		this.display = new Display();
		this.calculator = calculator;
	}
	
	public String send(String data) {
		long crc = this.calculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	
	public String configurarCRC(Calculator crc) {
		this.calculator = crc;
		return "Se cambio el calculador crc";
	}
	
	public String conectarCon(Connection conexion) {
		this.connection = conexion;
		this.display.showBanner(connection.pict());
		this.ringer.ring();
		return "Se cambio el tipo de conexion";
	}
}
