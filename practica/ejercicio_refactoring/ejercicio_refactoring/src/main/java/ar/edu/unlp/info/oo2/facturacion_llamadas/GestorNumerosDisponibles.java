package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<String>();
	private TipoGenerador tipoGenerador;
	
	public GestorNumerosDisponibles() {
		this.tipoGenerador = new GeneradorUltimo();
	}

	public SortedSet<String> getLineas() {
		return lineas;
	}
	
	public String obtenerNumeroLibre() {
		String linea = this.tipoGenerador.obtenerNumeroLibre(lineas);
		lineas.remove(linea);
		return linea;
	}
	
	public void cambiarTipoGenerador(TipoGenerador tipoGenerador) {
		this.tipoGenerador = tipoGenerador;
	}
	
	public boolean agregarNumeroTelefono(String numeroTelefono) {
		if (!getLineas().contains(numeroTelefono)) {
			getLineas().add(numeroTelefono);
			return true;
		}
		else {
			return false;
		}
	}
}
