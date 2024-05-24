package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class ArqueroCreador implements PersonajeFactory{

	public Personaje crearPersonaje() {
		List<Habilidad> lista = new ArrayList<>();
		lista.add(new CombateDistancia());
		return new Mago("Cocalibur Arquero", new Cuero(), new Arco(), lista);
	}
}
