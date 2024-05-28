package ar.edu.info.unlp.ejercicioDemo;

public class ConstructorVegetariano extends Constructor{

	@Override
	public void agregarPan() {
		this.getSandwich().agregarIngrediente(new Ingrediente("pan con semillas", 120));
	}

	@Override
	public void agregarAderezo() {
		this.getSandwich().agregarIngrediente(new Ingrediente("", 0));
	}

	@Override
	public void agregarPrincipal() {
		this.getSandwich().agregarIngrediente(new Ingrediente("provoleta grillada", 200));
	}

	@Override
	public void agregarAdicional() {
		this.getSandwich().agregarIngrediente(new Ingrediente("berenjenas al escabeche", 100));
	}

}