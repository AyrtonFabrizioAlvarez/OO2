package ar.edu.info.unlp.ejercicioDemo;

public class ConstructorVegano extends Constructor{

	@Override
	public void agregarPan() {
		this.getSandwich().agregarIngrediente(new Ingrediente("pan integral", 100));
	}

	@Override
	public void agregarAderezo() {
		this.getSandwich().agregarIngrediente(new Ingrediente("salsa criolla", 20));
	}

	@Override
	public void agregarPrincipal() {
		this.getSandwich().agregarIngrediente(new Ingrediente("milanesa de girgolas", 500));
	}

	@Override
	public void agregarAdicional() {
		this.getSandwich().agregarIngrediente(new Ingrediente("", 0));
	}
}