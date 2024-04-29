package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;
import java.util.stream.Collectors;

public class Novedad extends Sugerencia{

	
	public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
		return decodificador.getGrilla().stream()
				.sorted((p2, p1) -> p1.getEstreno().compareTo(p2.getEstreno()))
				.collect(Collectors.toList());
	}

	
}
