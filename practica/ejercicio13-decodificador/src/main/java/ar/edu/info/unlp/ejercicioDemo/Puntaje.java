package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;
import java.util.stream.Collectors;

public class Puntaje extends Sugerencia{

	public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
		return decodificador.getGrilla().stream()
				.sorted((p1, p2) -> Double.compare(p2.getPuntaje(), p1.getPuntaje()))
				.collect(Collectors.toList());
	}

}
