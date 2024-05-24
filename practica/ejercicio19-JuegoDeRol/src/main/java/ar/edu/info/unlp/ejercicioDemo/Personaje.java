package ar.edu.info.unlp.ejercicioDemo;

public abstract class Personaje {
	private String nombre;
	private int vida;
	
	public Personaje(String nombre) {
		this.nombre = nombre;
		this.vida = 100;
	}
	
	public boolean tieneVida() {
		return this.vida > 0;
	}
	
	public void recibirAtaque(int daño) {
		this.vida = this.vida - daño;
	}
	
	public void atacar(Personaje enemigo) {
		if(this.tieneVida()) {
			int daño = this.getArma().atacar(enemigo.getArmadura());
			enemigo.recibirAtaque(daño);
		}
	}
	
	public abstract Arma getArma();
	public abstract Armadura getArmadura();

}
