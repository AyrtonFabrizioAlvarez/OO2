package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class GuerreroCreador implements PersonajeFactory{
	
	public Personaje crearPersonaje() {
		List<Habilidad> lista = new ArrayList<>();
		lista.add(new CombateCuerpo());
		return new Mago("Cocalibur Guerrero", new Acero(), new Espada(), lista);
	}
}
