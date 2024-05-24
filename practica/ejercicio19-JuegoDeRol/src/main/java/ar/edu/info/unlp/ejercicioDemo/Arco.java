package ar.edu.info.unlp.ejercicioDemo;

public class Arco implements Arma{

	public int atacar(Armadura armadura) {
		return armadura.calcularDañoArco();
	}
}
