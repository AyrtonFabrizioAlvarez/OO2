package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;

public class GeneradorUltimo extends TipoGenerador {

	@Override
	public String obtenerNumeroLibre(SortedSet<String> lineas) {
		// TODO Auto-generated method stub
		return lineas.last();
	}

}
