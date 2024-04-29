package ar.edu.info.unlp.ejercicioDemo;

import java.util.zip.CRC32;


public class CRC32_Calculator implements Calculator{

	
	
	public long crcFor(String datos) {
		CRC32 crc = new CRC32();
		crc.update(datos.getBytes());
		long result = crc.getValue();
		return result;
	}
}
