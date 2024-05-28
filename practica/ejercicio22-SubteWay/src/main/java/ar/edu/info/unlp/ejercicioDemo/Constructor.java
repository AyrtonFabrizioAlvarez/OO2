package ar.edu.info.unlp.ejercicioDemo;

public abstract class Constructor {
	
	private Sandwich sandwich;

	public abstract void agregarPan();
	public abstract void agregarAderezo();
	public abstract void agregarPrincipal();
	public abstract void agregarAdicional();
	public void resetear() {
		this.sandwich = new Sandwich();
	}
	public Sandwich getSandwich() {
		return this.sandwich;
	}
}
