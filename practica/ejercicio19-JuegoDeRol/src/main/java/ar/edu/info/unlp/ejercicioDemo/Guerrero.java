package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class Guerrero extends Personaje{

	private Armadura armadura;
	private Arma arma;
	private List<Habilidad> habilidades;
	
	public Guerrero (String nombre, Armadura armadura, Arma arma, List<Habilidad> habilidades) {
		super(nombre);
		this.armadura = armadura;
		this.arma = arma;
		this.habilidades = habilidades;
	}
	
	public Arma getArma() {
		return this.arma;
	};
	public Armadura getArmadura() {
		return this.armadura;
	};

}
