package ar.edu.info.unlp.ejercicioDemo;

public class ConstructorSinTacc extends Constructor{
	public void agregarPan() {
		this.getSandwich().agregarIngrediente(new Ingrediente("pan de chipa", 150));
	}

	@Override
	public void agregarAderezo() {
		this.getSandwich().agregarIngrediente(new Ingrediente("salsa tartara", 18));
	}

	@Override
	public void agregarPrincipal() {
		this.getSandwich().agregarIngrediente(new Ingrediente("carne de pollo", 250));
	}

	@Override
	public void agregarAdicional() {
		this.getSandwich().agregarIngrediente(new Ingrediente("verduras grilladas", 200));
	}
}
