package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DispositivoTest {
	private Dispositivo dispositivo1;
	private Dispositivo dispositivo2;
	

	@BeforeEach
	public void setUp() throws Exception {
		this.dispositivo1 = new Dispositivo(new WifiConnection(), new CRC16_Calculator());
		this.dispositivo2 = new Dispositivo(new ConnectionAdapter(), new CRC32_Calculator());
		
	}

	@Test
	public void testSend() {
		assertEquals("Utilizando la conexion wifi para enviar datos",this.dispositivo1.send("Datos"));
		assertEquals("Utilizando la conexion 4g para transmitir datos",this.dispositivo2.send("Datos"));
	}
	
	@Test
	public void testConectarCon() {
		assertEquals("Se cambio el tipo de conexion", this.dispositivo1.conectarCon(new ConnectionAdapter()));
		assertEquals("Se cambio el tipo de conexion", this.dispositivo1.conectarCon(new WifiConnection()));
		
	}
	
	@Test
	public void testConfigurarCRC() {
		assertEquals("Se cambio el calculador crc",this.dispositivo1.configurarCRC(new CRC32_Calculator()));
		assertEquals("Se cambio el calculador crc",this.dispositivo1.configurarCRC(new CRC16_Calculator()));
	}

}
