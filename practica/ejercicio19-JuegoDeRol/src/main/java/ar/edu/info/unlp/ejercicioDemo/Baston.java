package ar.edu.info.unlp.ejercicioDemo;

public class Baston implements Arma{

	public int atacar(Armadura armadura) {
		return armadura.calcularDañoBaston();
	}
}
