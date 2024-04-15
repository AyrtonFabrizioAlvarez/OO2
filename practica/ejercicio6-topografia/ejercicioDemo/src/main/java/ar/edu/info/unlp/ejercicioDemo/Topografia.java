package ar.edu.info.unlp.ejercicioDemo;

public abstract class Topografia {

	public double calcularProporcionTierra() {
		return 1 - this.calcularProporcionAgua();
	}
	
	public abstract double calcularProporcionAgua();
	
	public boolean sonTopografiasIguales(Topografia topografia) {
		return this.calcularProporcionAgua() == topografia.calcularProporcionAgua();
	}
	
	/*Si llega una mixta y quiero compararla con una simple, da false*/
	protected boolean equalsToMixta(TopografiaCompuesta mixta) {
		return false;
	}
	
	@Override
	/*En este caso hago downcasting porque sobreescribo el metodo de lista, que recibe un OBJECT
	 * en este caso yo se que SIEMPRE recibire una TOpografia (simple o compuesta) y por eso lo downcasteo a topografia*/
	public boolean equals(Object obj) {
		return this.sonTopografiasIguales((Topografia)obj);
	}
	
	
}
