package ar.edu.info.unlp.ejercicioDemo;

public class ConstructorClasico extends Constructor{

	@Override
	public void agregarPan() {
		this.getSandwich().agregarIngrediente(new Ingrediente("pan brioche", 100));
	}

	@Override
	public void agregarAderezo() {
		this.getSandwich().agregarIngrediente(new Ingrediente("mayonesa", 20));
	}

	@Override
	public void agregarPrincipal() {
		this.getSandwich().agregarIngrediente(new Ingrediente("carne de terneta", 300));
	}
	@Override
	public void agregarAdicional() {
		this.getSandwich().agregarIngrediente(new Ingrediente("tomate", 80));
	}
	

}
