package ar.edu.info.unlp.ejercicioDemo;

public class Sistema {

	private Constructor constructor;
	
	public Sistema(Constructor constructor) {
		this.constructor = constructor;
	}
	
	public Sandwich crearSandwich() {
		this.constructor.resetear();
		this.constructor.agregarPan();
		this.constructor.agregarAderezo();
		this.constructor.agregarPrincipal();
		this.constructor.agregarAdicional();
		return this.constructor.getSandwich();
	}
}
