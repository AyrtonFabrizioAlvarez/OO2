package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;

public class Sandwich {

	private ArrayList<Ingrediente> ingredientes;
	
	
	public void agregarIngrediente(Ingrediente ingrediente) {
		this.ingredientes.add(ingrediente);
	}
	public double calcularMonto() {
		return this.ingredientes.stream().mapToDouble(ingrediente -> ingrediente.getPrecio()).sum();
	}
}
