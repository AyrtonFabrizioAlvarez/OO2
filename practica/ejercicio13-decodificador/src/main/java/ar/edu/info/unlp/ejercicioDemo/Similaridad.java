package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;
import java.util.stream.Collectors;

public class Similaridad extends Sugerencia{

	public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
		return decodificador.getGrilla().stream()
				.map(pelicula -> pelicula.getSimilares())
				.flatMap(listaSimilares -> listaSimilares.stream())
				.distinct().collect(Collectors.toList());
	}

}
