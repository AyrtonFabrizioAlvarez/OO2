package ar.edu.info.unlp.ejercicioDemo;

public class Espada implements Arma{

	public int atacar(Armadura armadura) {
		return armadura.calcularDañoEspada();
	}
}
