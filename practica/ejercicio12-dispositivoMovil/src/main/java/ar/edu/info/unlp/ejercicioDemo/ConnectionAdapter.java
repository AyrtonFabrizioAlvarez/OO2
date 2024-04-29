package ar.edu.info.unlp.ejercicioDemo;

public class ConnectionAdapter implements Connection{
	private FourgConnection adaptee;
	
	public ConnectionAdapter() {
		adaptee = new FourgConnection();
	}


	public String sendData(String data, long crc) {
		return this.adaptee.transmit(data, crc);
	}


	public String pict() {
		return this.adaptee.getSymb();
	}
	
	
	
}
