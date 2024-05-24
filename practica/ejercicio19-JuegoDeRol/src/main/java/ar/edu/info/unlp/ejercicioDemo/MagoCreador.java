package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class MagoCreador implements PersonajeFactory{

	public Personaje crearPersonaje() {
		List<Habilidad> lista = new ArrayList<>();
		lista.add(new CombateDistancia());
		lista.add(new Magia());
		return new Mago("Cocalibur Mago", new Cuero(), new Baston(), lista);
	}
}
